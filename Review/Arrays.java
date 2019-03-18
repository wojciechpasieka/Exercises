package Review;

import java.lang.reflect.Array;

public class Arrays {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 3, 8, 4, 8};
        Integer[][] array = {{5, 2, 3, 8, 4, 8},{1, 6, 9}};

        firstExercise(arr);
        secondExercise(arr);
        thirdExercise(arr);
        fourthExercise(arr);
        fifthExercise(arr);
        sixthExercise(arr,8);
        seventhExercise(array);
        eighthExercise(arr);

    }

    public static void firstExercise(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void secondExercise(Integer[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void thirdExercise(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static int fourthExercise(Integer[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static int fifthExercise(Integer[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 5) {
                counter++;
            }
        }
        System.out.println("Liczb mniejszych niż 5 jest: " + counter);
        return counter;
    }

    public static void sixthExercise(Integer[] arr, int number) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                counter++;
            }
        }
        System.out.println("Liczba " + number + " występuje w tablicy " + counter + " razy");
    }

    public static void seventhExercise(Integer[][] arr){
        int size = 0;
        for (int i = 0; i < arr.length ; i++) {
            size += arr[i].length;
        }

        Integer[] result = new Integer[size];
        int index = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[index] = arr[i][j];
                index++;
            }
        }
        System.out.println(java.util.Arrays.asList(result));
    }

    public static void eighthExercise(Integer[] arr){
        if(arr.length % 2 != 0){
            throw new IllegalArgumentException("Nieparzysta liczba argumentów w tablicy :(");
        }

        Integer[][] result = new Integer[arr.length/2][2];

        int index = 0;
        for (int i = 0; i < result.length ; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = arr[index];
                index++;
            }
        }
        System.out.println(java.util.Arrays.deepToString(result));
    }

}
