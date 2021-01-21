package com.codewithmosh;

public class Casting {
    public static void main(String[] args){
        //implicit casting
        //byte > short > int > long
        short x = 1;
        int y = x + 2;
        String ex = "1";
        int ab = Integer.parseInt(ex) + 4; //Taking a string and converting to integer
        double a = 1.1;
        int b = (int)a + 2;
        System.out.println(y);
        System.out.println(b);
        System.out.println(ab);
    }
}
