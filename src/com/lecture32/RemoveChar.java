package com.lecture32;

public class RemoveChar {
    static void main(String[] args) {
        System.out.println(remove("baccdah"));
        System.out.println(removeApple("bascapplecbdh"));
        System.out.println(removeAppNotApple("bascapplecbdh"));
    }

    static void remove(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            remove(p,up.substring(1));
        } else{
            remove(p + ch, up.substring(1));
        }
    }

    static String remove(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            return remove(up.substring(1));
        } else{
            return ch + remove(up.substring(1));
        }
    }

    static String removeApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return removeApple(up.substring(5));
        } else{
            return up.charAt(0) + removeApple(up.substring(1));
        }
    }
    static String removeAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return removeAppNotApple(up.substring(3));
        } else{
            return up.charAt(0) + removeAppNotApple(up.substring(1));
        }
    }
}
