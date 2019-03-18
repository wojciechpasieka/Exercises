package Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListReview {
    public static void main(String[] args) {
        exercise1(new int[]{1, 4, 6});
        exercise2(Arrays.asList("1", "2", "3", "4"));
        exercise3(Arrays.asList(1, 2, 3, 4, 5));
        exercise4(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
    }

    public static List<Integer> exercise1(int[] arr){
        List<Integer> list = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length ; i++) {
            list.add(arr[i]);
        }

        System.out.println(list.toString());

        return list;
    }

    public static List<String> exercise2(List<String> input){
        List<String> output = new ArrayList<>(input.size());

        for (int i = input.size() - 1; i >= 0 ; i--) {
            output.add(input.get(i));
        }

        System.out.println(output.toString());

        return output;
    }

    public static List<Integer> exercise3(List<Integer> input){
        int size = input.size();
        Integer[] arr = new Integer[size];

        Integer variable;
        for (int i = 0; i < input.size(); i++) {
            variable = input.get(i);
            arr[(i + 2) % size] = variable;
        }

        List<Integer> output = Arrays.asList(arr);
        System.out.println(output.toString());

        return output;
    }

    public static void exercise4(List<Integer> input){

        Integer max = input.stream()
                .max((integer, anotherInteger) -> integer.compareTo(anotherInteger))
                .get();

        System.out.println("Max: " + max);

        Integer min = input.stream()
                .min((integer, anotherInteger) -> integer.compareTo(anotherInteger))
                .get();

        System.out.println("Min: " + min);

        long counter = input.stream()
                .count();

        System.out.println("Amount of elements: " + counter);

        int sum = input.stream()
                .mapToInt(i -> i.intValue())
                .sum();

        System.out.println("Suma to: " + sum);

        input.stream()
                .filter(integer -> integer > 5)
                .forEach(integer -> System.out.print(integer + " "));
        System.out.println();


        input.stream()
                .map(integer -> Math.pow(integer, 2))
                .forEach(i -> System.out.print(i + " "));


    }
}
