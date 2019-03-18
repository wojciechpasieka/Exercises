import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsReview {

    public static void main(String[] args) {
        //exercise1();
        System.out.println(exercise2("Mam na imię Wojtek"));
    }

    public static String exercise2(String sentence) {
        int counter = 0;
        String letter = "";

        for (Character i = 'a'; i <=  'z' ; i++) {
            if(countLetter(String.valueOf(i), sentence) > counter){
                letter = String.valueOf(i);
                counter = countLetter(String.valueOf(i), sentence);
            }
        }

    return "Litera: " + letter + " jest najczęściej występującą bo występuje aż: " + counter + " razy";
    }

    public static int countLetter(String letter, String sentence){
        String repleced = sentence.toLowerCase().replace(letter, "");

        return sentence.length() - repleced.length();
    }

    public static void exercise1(){
        Map<String, Integer> mapka = new TreeMap<>();

        //podpunkt a
        mapka.put("Wojtek", 25);
        mapka.put("Kamil", 15);
        mapka.put("Bartek", 35);
        mapka.put("Piotrek", 45);
        mapka.put("Marek", 55);


        //podpunkt b
        System.out.println(mapka.entrySet());

        //podpunkt c
        mapka.put("Maja", 45);
        System.out.println(mapka.entrySet());

        //podpunkt d
        mapka.put("Piotrek", 05);
        System.out.println(mapka.entrySet());
    }
}
