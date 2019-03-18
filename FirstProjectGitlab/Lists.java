package FirstProjectGitlab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lists {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        pointA(array);
        List<String> firstList = new ArrayList<>();
        firstList.add("Wojtek");
        firstList.add("Kinga");
        firstList.add("Ania");
        firstList.add("Zosia");
        List<Integer> exampleList = new ArrayList<>();
        exampleList.add(12);
        exampleList.add(33);
        exampleList.add(64);
        exampleList.add(7);
        exampleList.add(1);
        exampleList.add(29);
        exampleList.add(18);
        exampleList.add(-18);


//        for(String i : firstList){
//            System.out.print(i + " ");
//        }
//        System.out.println();

        //pointA(array);
        //pointB(firstList);
        //pointC(exampleList, 2);
        //pointD(exampleList);

    }

    static List<Integer> pointA(int[] tab) {
        List<Integer> ret = new ArrayList<>();

        for (int i = 0; i < tab.length; i++) {
            ret.add(tab[i]);
        }

        for (int i = 0; i < ret.size(); i++) {
            System.out.print(ret.get(i) + " ");
        }
        System.out.println();
        System.out.println("********");

        for (Integer i : ret) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("*******");

        System.out.println(ret);
        return ret;
    }

    static List<String> pointB(List<String> firstlist) {
        List<String> secondList = new LinkedList<>();

        for (int i = firstlist.size() - 1; i >= 0; i--) {
            secondList.add(firstlist.get(i));
        }

        for (String i : secondList) {
            System.out.print(i + " ");
        }

//        for (int i = 0; i < secondList.index() ; i++) {
//            System.out.print(secondList.get(i) + " ");
//
//        }

        return secondList;
    }

    static List<Integer> pointC(List<Integer> firstList, int n) {
        List<Integer> secondList = new ArrayList<>();
        System.out.println(firstList);

        int initialPoint = firstList.size() - n;

        for (int i = 0; i < firstList.size(); i++) {
            secondList.add(firstList.get((i + initialPoint) % firstList.size()));
        }
        System.out.println(secondList);

        return secondList;
    }

    static void pointD(List<Integer> list) {

        //podpunkt a
        System.out.println("Najmniejszy element listy to:");
        Integer min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println(min);

        //podpunkt b
        System.out.println("Największy element listy to:");
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println(max);

        //podpunkt c
        System.out.println("Suma wszystkich elementów listy wynosi:");
        Integer sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        System.out.println(sum);

        //podpunkt d
        System.out.println("Liczba elementów wynosi " + list.size());

        //podpunkt e
        System.out.println("Podaj od jakiej liczby chcesz otrzymać tylko większe elementy");
        Integer number = scanner.nextInt();
        System.out.println("Elementy większe od " + number + " to:");

        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers1 = new ArrayList<>();
        for (Integer i : list) {
            if (i > number) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > number) {
                numbers1.add(list.get(i));
            }
        }
        System.out.println(numbers1);

        //podpunkt f
        System.out.println("Kwadraty elementów podanej listy to:");
        List<Integer> square = new ArrayList<>();
        for (Integer i : list) {
            square.add(i * i);
        }
        System.out.println(square);
    }
}
