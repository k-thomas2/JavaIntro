package com.codewithmosh;

import java.util.Date;

public class ReferenceTypes {
    public static void main(String[]arg){
        byte age = 30;
        Date now = new Date();
        System.out.println(now);
        String message = "Hello, World" + "!!";
        //message.endsWith("!!"); Checks to see if specified variable ends in !!. Returns true
        System.out.println(message);
    }
}
