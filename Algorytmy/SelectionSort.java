package Algorytmy;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {5, 1, 2, 7, 9, 4, 6};
        System.out.println(Arrays.toString(array));

        //System.out.println(Arrays.toString(selectionSort(array)));

        System.out.println(Arrays.toString(selectionSort2(array)));



    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }

    public static int[] selectionSort2 (int[] array){

        int temp;
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        return array;
    }


}



