package FirstProjectGitlab;

import java.util.Scanner;

public class startedExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz rozmiar ");
        int size = scanner.nextInt();
        startedExercise(size);
    }

    public static void startedExercise(int size){

        for (int i = 0; i <= size ; i++) {
            for (int j = 0; j <= size ; j++) {
                if ( i == j){
                    if (j >= 10){
                        System.out.print("*  ");
                    }else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();

        }
    }
}


