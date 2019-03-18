package Algorytmy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {
        int[] array = {6, 3, 8, 2, 5, 7, 3, 5, 1, 0};
        printing(array);

        printing(bubbleSorting(array));
        System.out.println(Arrays.toString(bubbleSort(array)));
        System.out.println(Arrays.toString(bubbleSort3(array)));

    }

    public static int[] bubbleSorting (int[] array){
        int c;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 ; j++) {
                if (array[j] > array[j + 1]){
                    c = array[j + 1];
                    array[j + 1] = array [j];
                    array[j] = c;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSort (int[] array){
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int j = 0; j < array.length - 1 ; j++) {
                if (array[j] > array[j + 1]) {
                    swapped = true;
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        return array;
    }

    public static void printing(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+ ", ");
        }
        System.out.println();
    }


    public static int[] bubbleSort3 (int[] array){

        int temp;
        for (int i = 0; i < array.length - 1 ; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
