package com.codewithmosh;

public class TheMathClass {
    public static void main(String[] args){
       int result = Math.round(1.1F);
       int result2 = (int)Math.ceil(2.3); //ceil is ceiling
        int result3 = (int)Math.floor(2.9F);
        int result4 = Math.max(1,2); //returns largest. There is also min
        double result5 = Math.random(); //Generates random value between 0 and 1
        double result6 = Math.random() * 100; //Generates random number between 0 and 100
        int roundedresult = (int) (Math.random() * 100);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(roundedresult);
    }
}
