package Algorytmy;

import java.util.Arrays;

public class MergeSort {

    public static int[] arr = {19, 20, 2, 15, 4, 7, 10};
    public static final int N = arr.length;
    public static int[] arrayHelpful = new int[arr.length];

    public static void main(String[] args) {
        for (int i = 0; i < N ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        divideArray(0, N - 1);

        for (int i = 0; i < N ; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void divideArray(int first, int last){
        int middle;
        if(first<last){
            middle = (first+last)/2;
            divideArray(first, middle);
            divideArray(middle + 1, last);
            mergeArray(first,middle,last);
        }
    }

    private static void mergeArray(int first, int middle, int last) {

        int i, j, q;
        for (i = first; i <= last ; i++) {
            arrayHelpful[i] = arr[i];
        }

        i = first; j = middle + 1; q = first;

        while (i <= middle && j <= last){
            if(arrayHelpful[i] < arrayHelpful[j]){
                arr[q++] = arrayHelpful[i++];
            } else {
                arr[q++] = arrayHelpful[j++];
            }
        }

        while (i <= middle){
            arr[q++] = arrayHelpful[i++];
        }
    }

}