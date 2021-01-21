package com.codewithmosh;

import java.util.Arrays;

public class LearnArrays {

        public static void main(String[]args){
            //used to store a list of items. Specify size/length of array within square bracket
            //int[] numbers = new int[5];
            //numbers[0] = 1; //setting index 0 to the value of 1
            //numbers[1] = 2;
            int[] numbers = {1, 2, 5, 2, 4}; //most efficient way to declare values in an array
            //Arrays have a fixed size in Java. Cannot add or remove values once created. They have a fixed length
            //Arrays can easily be sorted using the sort method in the Arrays class
            Arrays.sort(numbers);
            System.out.println(Arrays.toString(numbers));
        }
    }

