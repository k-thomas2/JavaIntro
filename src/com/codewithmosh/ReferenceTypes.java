package com.codewithmosh;

import java.util.Date;
import java.util.Locale;

public class ReferenceTypes {
    public static void main(String[]arg){
        byte age = 30;
        Date now = new Date();
        System.out.println(now);
        String message = "Hello, World" + "!!";
        //message.endsWith("!!"); Checks to see if specified variable ends in !!. Returns true
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length()); //Gets the length and prints it out
        System.out.println(message.startsWith("@"));
        System.out.println(message.indexOf("H")); //provides index of value passed
        System.out.println(message.replace("!","*")); //replaces !! with **
        //target and replacement are parameters. ! and * are arguments
        System.out.println(message.toLowerCase(Locale.ROOT));
    }
}
