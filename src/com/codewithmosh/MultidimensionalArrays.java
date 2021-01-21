package com.codewithmosh;

import java.util.Arrays;

public class MultidimensionalArrays {
        public static void main(String[] args){
           // int [] [] numbers = new int[2][3]; //2 dimensional array. 2 rows and 3 columns
           // numbers [0][0] = 1; //setting index
            int [][][] numbers2 = new int[2][3][5]; //3 dimensional array
            int [][] numbers = { {1, 2, 3}, {4, 5, 6}};
            System.out.println(Arrays.deepToString(numbers2));
            System.out.println(Arrays.deepToString(numbers)); //use this for printing multidimensional arrays
        }
    }

