package Algorytmy;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {5, 1, 2, 8, 4, 6, 9, 3};
        System.out.println(Arrays.toString(array));


        //System.out.println(Arrays.toString(insertSort2(array)));
        //System.out.println(Arrays.toString(insertSort(array)));
        //System.out.println(Arrays.toString(insertSort3(array)));
        System.out.println(Arrays.toString(insertSort4(array)));

    }

    public static int[] insertSort(int[] array){
        int tmp;
        for (int i = 1; i < array.length ; i++) {
            tmp = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (tmp < array[j]){
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
        return array;
    }

    public static int[] insertSort2 (int[] array){
        int temp;
        for (int i = 1; i < array.length ; i++) {
            temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }


        return array;
    }

    public static int[] insertSort3(int[] array){

        for (int i = 1; i < array.length ; i++) {
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0 ; j--) {
                if (array[j] > temp){
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = temp;

        }
        return array;
    }

    public static int[] insertSort4(int[] array){
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int temp = array[i];
            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }

}
