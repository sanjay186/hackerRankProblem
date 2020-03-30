package com.hackerrank;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[10];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.next();
        }
        sc.close();
        String even = null;
        String odd = null;
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();
        for (int j = 0; j < num; j++) {
            for (int sa = 0; sa < arr[j].length(); sa++) {
                if (sa == 0 || sa % 2 == 0) {
                    str.append(arr[j].charAt(sa));
                    odd = str.toString();

                } else {
                    //  odd=String.valueOf(s.charAt(sa));
                    str1.append(arr[j].charAt(sa));
                    even = str1.toString();
                }
            }
            System.out.println(odd + "  " + even);
            str.setLength(0);
            str1.setLength(0);

        }
    }
}
