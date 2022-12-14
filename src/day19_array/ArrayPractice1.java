package day19_array;

import java.util.Arrays;
import java.util.Objects;

public class ArrayPractice1 {
    public static void main(String[] args) {


        int[] array = {10,15,21,13,18};
        for (int each : array) {
            System.out.print(each+" ");
        }

        int[] array2 = Arrays.copyOf(array,20);
        System.out.println(Arrays.toString(array2));
        int[] array3 = Arrays.copyOfRange(array,2,5);
        System.out.println(Arrays.toString(array3));
    }
}
