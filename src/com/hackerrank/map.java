package com.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map {

public static void main(String [] args ){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    HashMap<String , Integer> PhoneBook = new HashMap<>();
    for(int i = 0; i < n; i++){
        String name = in.next();
        int phone = in.nextInt();
        PhoneBook.put(name , phone);
    }
    while(in.hasNext()){
        String s = in.next();
        // Write code here
        if(PhoneBook.containsKey(s)){
            int phon= PhoneBook.get(s);
            System.out.println(s+"="+phon);
        }else{
            System.out.println("Not Found");
        }
    }
    in.close();
}
}
