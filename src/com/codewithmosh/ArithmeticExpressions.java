package com.codewithmosh;

public class ArithmeticExpressions {
    public static void main(String[] args){
        int result = 10 + 3;
       // int result2 = 10 / 3; //In Java, the division of 2 whole numbers is a whole number.
        double result2 = (double)10 / (double) 3;
        int x = 1;
       // x++;
        x = x + 2; //same as below
        x += 2; //augmented/compound assignment operator. -=, *=, /=
        System.out.println(result2);
        System.out.println(x);
    }
}
