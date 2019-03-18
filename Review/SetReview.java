package Review;

import java.util.*;
import java.util.Arrays;

public class SetReview {
    public static void main(String[] args) {

        exercise1();
        System.out.println(isRepetition(Arrays.asList("Wojtek", "Kamil", "Bartek", "Bartek")));
        repeatWords(Arrays.asList("Wojtek", "Kamil", "Bartek", "Bartek"));


    }

    public static List<String> repeatWords(List<String> list){
        Set<String> set = new HashSet<>();
        Set<String> set1 = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            if(!set.contains(list.get(i))){
                set.add(list.get(i));
            } else{
                set1.add(list.get(i));
            }
        }

        System.out.println(set1.toString());

        String[] arr = new String[set1.size()];
        arr = set1.toArray(arr);

        return Arrays.asList(arr);
    }

    public static boolean isRepetition(List<String> list){
        Set<String> set = new HashSet<>();

        for (int i = 0; i < list.size() ; i++) {
            set.add(list.get(i));
        }

        return !(list.size() == set.size());
    }


    public static Integer[] exercise1(){
        Random random = new Random();
        Set<Integer> set = new HashSet<>(6);

        for (int i = 0; i < 6; i++) {
            set.add(random.nextInt(50) + 1);
        }

        Integer[] arr = new Integer[set.size()];

        arr = set.toArray(arr);

        System.out.println(Arrays.asList(arr));

        return arr;
    }


}
