package com.codewithmosh;

public class EscapeSequences {
    public static void main(String []args){
        String message = "Hello \"Mosh\""; // adding a \before quotes allows you to add them in the string rather
        //than having the compiler read it and expecting a valid string value
        String message2 = "c:\\Windows\\.."; //prefix special characters with a backslash \
        //backslash n creats a new line \n
        String message3 = "c:\nWindows\\";
        String message4 = "c:\tWindows\\"; //use \t to create a tab
        System.out.println(message);
        System.out.println(message2);
        System.out.println(message3);
        System.out.println(message4);
    }
}
