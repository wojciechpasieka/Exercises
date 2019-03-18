package FirstProjectGitlab;

import java.util.Scanner;

public class ConditionB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sprawdź czy podane imię jest imieniem żeńskim. Wpisz imię:");

        String name;
        do {
            name = scanner.nextLine();
            System.out.println(isWoman(name));
        } while (isWoman(name) == false);
        System.out.println("Imię " + name + " jest imieniem żeńskim");

        System.out.println("Wpisz kolejne imię");
        do {
            name = scanner.nextLine();
            System.out.println(isWoman2(name));
        } while (isWoman2(name) == false);
        System.out.println("Imię " + name + " jest imieniem żeńskim");

    }
    public static boolean isWoman(String inputName){
        char[] letters = inputName.toLowerCase().toCharArray();
        if (letters[letters.length - 1] == 'a' ){
            return true;
        } else{
            return false;
        }
    }

    public static boolean isWoman2(String inputName){
        Boolean lastLetter = inputName.toLowerCase().endsWith("a");

        if (lastLetter){
            return true;
        }
        return false;
    }
}
