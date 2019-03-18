package Algorytmy;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {4, 2, 8, 9, 3, 5, 23, 67, 45, 6, 35};
        System.out.println(Arrays.toString(array));

        quickSort2(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));


    }

    public static void quickSort(int[] array, int first, int last){

        int i, j, pivot, temp;
        i = first;
        j = last;
        pivot = array[(first + last)/2];


        do{
            while (array[i] < pivot){
                i++;
            }
            while (array[j] > pivot){
                j--;
            }
            if (i <= j){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }while (i < j);


        if(first < j){
            quickSort(array, first, j);
        }
        if(i < last){
            quickSort(array, i, last);
        }
    }



    public static int[] quickSort2 (int[] array, int first, int last){

        int i, j, pivot, temp;
        i = first;
        j = last;
        pivot = array[(first + last)/2];

        do{
            while (array[i] < pivot){
                i++;
            }
            while (array[j] > pivot){
                j--;
            }

            if (i <= j){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

        }while(i < j);

        if (first < j) {
            quickSort(array, first, j);
        }

        if (last > i){
            quickSort(array, i, last);
        }

        return array;
    }
}
