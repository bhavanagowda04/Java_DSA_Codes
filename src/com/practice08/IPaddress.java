package com.practice08;
//https://leetcode.com/problems/defanging-an-ip-address/description/
import java.util.Arrays;

public class IPaddress {
    static void main() {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}

