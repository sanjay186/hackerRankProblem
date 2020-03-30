package com.hackerrank;

import java.util.Scanner;

public class recerssion {

   static  int factor(int n){
       //result = n;
   if(n<=0){

      // System.out.println("inside the if condition"+);
       return 1;

   }else{
     //  sum = sum * n;
       System.out.println(n);
       return n*factor (n-1);
   }
     //  return (n == 1) ? 1 : n*factor(n-1) ;
    }


public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int num =sc.nextInt();
    sc.close();
    int result = factor(num);
    System.out.println(result);


}

}
