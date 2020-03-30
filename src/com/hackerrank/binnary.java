package com.hackerrank;

import java.util.Scanner;

public class binnary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        String val = Integer.toBinaryString(num);
      //  String test = val.split("0").toString();
        System.out.println(val);
       // System.out.println(test);

//int count=0;
//for(int i=0;i< val.length(); i++){
//    if(val.charAt(i) && val.charAt(i-1)){
//        count++;
//    }
//    else {
//     System.out.println("the first value"+ val.charAt(i) +"the second value "+val.charAt(i+1));
//    }
//    }
//    System.out.println("the value of the count"+count);
        int consecutiveOne = 0;
        for (String str : val.split("0")) {
            consecutiveOne = str.length() > consecutiveOne ? str.length() : consecutiveOne;
        }
        System.out.println(consecutiveOne);
    }

}
