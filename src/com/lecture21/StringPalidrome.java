package com.lecture21;

public class StringPalidrome {
    public static void main(String[] args) {
        String name = "aba";
        System.out.println(palidrome(name));
    }
    static boolean palidrome(String name){
        if(name.length() == 0 ){
            return true;
        }
        name = name.toLowerCase();
        for(int i = 0; i <= name.length()/2; i++){
            char start = name.charAt(i);
            char end = name.charAt(name.length() -1 -i);
            if(start != end) {
                return false;
            }

        }
        return true;
    }
}
