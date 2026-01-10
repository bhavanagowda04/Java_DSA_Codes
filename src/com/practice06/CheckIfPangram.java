package com.practice06;

class CheckIfPangram {
    static void main() {
        String sentence = "bcdefghijklmnopqrstuvwxyz";
        System.out.println(checkIfPangram(sentence));;
    }
    static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26){
            return false;
        }
        for(char ch = 'a'; ch <= 'z'; ch++ ){
            boolean ans = false;
            for (int i = 0; i < sentence.length(); i++) {
                if(ch == sentence.charAt(i)){
                    ans = true;
                }
            }
            if(ans == false){
                return false;
            }
        }
        return true;
    }
}