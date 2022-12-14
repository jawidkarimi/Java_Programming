package day22_arrayList;

import java.sql.SQLOutput;
import java.util.*;

public class MaxMinNumbersOfMultiDArray {


    public static void main(String[] args) {

        //index of elements:     0    1   2      0   1    2      0     1   2
        int[][] array = {{100, 20000, 300}, {10, 1000, 50}, {-200, 400, 0}}; //indexes of array: 0 ~ 2
        // index of 1D array          0              1                2

        int max = array[0][0];
        int min = array[0][0];

        for (int[] each1D : array) {

            for (int eachElement : each1D) {

                if (eachElement > max) {
                    max = eachElement;
                }

                if (eachElement < min) {
                    min = eachElement;
                }

            }

        }


        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);


        System.out.println("****************By Stream *******************");
        int [] number = {1,2,3,4,5,6,7};
        int max1 = Arrays.stream(number)
                .max()
                .getAsInt();
        int min1 = Arrays.stream(number).min().getAsInt();

        System.out.println("Max: " + max1);
        System.out.println("Min: " + min1);

        System.out.println("____________________________________________________");

        IntSummaryStatistics stats = Arrays.stream(number).summaryStatistics();
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());

        System.out.println("Max and Min from Arrays List by Stream");

        List<Integer> num1 = Arrays.asList(1,2,3,4,5,6,7);
        Integer max3 = num1.stream()
                .max(Comparator.comparing(Integer::valueOf)).get();
        Integer min3= num1.stream()
                .min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max: "+ max3);
        System.out.println("Min: "+ min3);




    }


}

/*
2. Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000

 */
