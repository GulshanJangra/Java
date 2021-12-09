package com.company;

public class Recursion_Example {
    static int a = 0;
    static void r(){
        a++;
        if(a<=5){
            System.out.println("Recursion" +a);
            r();
        }
    }

    public static void main(String[] args) {
        r();
    }
}
