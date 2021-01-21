package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        //EXAMPLES OF TYPES
        int myAge = 25;
        int hisAge = myAge;
        byte age = 32;
        int viewsCount = 123_456_789; //can use underscores in Java every 3 numbers to be more readable. Like a comma
        long viewsCounted = 3_123_456_789L;	//By default, the Java compiler reads numbers as an integer. Suffix L for Long.
        float newPrice = 11.95F; //Java compiler reads #s with decimal point as double. Suffix with F for float
        double price = 10.99;
        char letter = 'A'; //Use single quotes for single letters and double quotes for multiple letters
        boolean isEligible = true;
        System.out.println(age);
	System.out.println(hisAge);
    }
}
