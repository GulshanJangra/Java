package com.company;

import java.util.Scanner;

public class Factorial_Recursion {
    static int fact(int a){
        if (a==1)
            return 1;
        else
            return(a * fact(a-1));
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(fact(a));
    }
}
