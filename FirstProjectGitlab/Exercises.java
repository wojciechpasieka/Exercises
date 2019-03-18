package FirstProjectGitlab;

import java.util.Random;

public class Exercises {
    public static void main(String[] args) {
        Random generator = new Random();
        int[] exampleArray = new int[20];
        for (int i = 0; i <exampleArray.length ; i++) {
            exampleArray[i] = generator.nextInt(56);
            System.out.print(exampleArray[i]+ " ");
        }
        System.out.println();
        System.out.println("Roznica wynosi: " + distinctionEvenAndOdd(exampleArray));
    }

    public static int distinctionEvenAndOdd(int[] array){
        int even = 0;
        int odd = 0;

        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }
        return Math.abs(even - odd);
    }
}
