package FirstProjectGitlab;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {
        //popdpunkt A - sprawdzenie czy dany wyraz jest palindromem
        String sentenceA = "igor  rogi";

        System.out.println(isPalindrom(sentenceA));


        //podpunkt B- sprawdzenie czy podane Stringi są anagramami
        String sentence1 = "I am Lord Voldemort";
        String sentence2 = "Tom Marvolo Riddle";

        System.out.println(isAnagram(sentence1, sentence2));


        //podpunkt C- sprawdzenie czy nawiasy się zamykają
        String sentenceC = "asfafa)((()sfasfa)";

        System.out.println(pointC(sentenceC));


        //podpunkt D
        String sentenceD = "1,Wojciech,Pasieka\n2,Radek,Cierpiol\n3,Kamil,Lysy\n4,Kinia,Gawel";
        System.out.println(sentenceD);
//        String[][] arrayD;
//        arrayD[] = sentenceD.split("\n");
//



        //podpunkt E- łańuch nukleotydów
        String sentenceE = "AA ";

        System.out.println(pointE(sentenceE));



    }


    public static boolean isPalindrom(String something) {

        something = something.toLowerCase().replace(" ", "").replace(",", "");
        char[] sth = something.toCharArray();
        char[] reverseSth = new char[sth.length];

        int index = 0;
        for (int i = sth.length - 1; i >= 0; i--) {
            reverseSth[index] = sth[i];
            index++;
        }

        return Arrays.equals(sth, reverseSth);

//        for (int i = 0; i < sth.length; i++) {
//            if (sth[i] != reverseSth[i]) {
//                return false;
//            }
//        }
//        return true;
    }

    public static boolean isAnagram(String sentence1, String sentence2) {
        String first = sentence1.toLowerCase().replace(" ", "").replace(",", "");
        String second = sentence2.toLowerCase().replace(" ", "").replace(",", "");

        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }


    public static boolean pointC(String sentence) {

        char[] charArray = sentence.toCharArray();

        char[] firstArray = new char[charArray.length];
        char[] secondArray = new char[charArray.length];
        int firstIndex = 0;
        int secondIndex = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(') {
                firstArray[firstIndex] = charArray[i];
                firstIndex++;
            } else if (charArray[i] == ')') {
                secondArray[secondIndex] = '(';
                secondIndex++;
            }
        }
        return Arrays.equals(firstArray, secondArray);
    }



    public static StringBuilder pointE(String inputSentence) {
        inputSentence = inputSentence.toUpperCase();
        StringBuilder outputStentence = new StringBuilder();
        StringBuilder outputStentenceMistake = new StringBuilder();

        for (int i = 0; i < inputSentence.length(); i++) {
            if (inputSentence.charAt(i) != 'T' && inputSentence.charAt(i) != 'A' &&
                inputSentence.charAt(i) != 'C' && inputSentence.charAt(i) != 'G'){
                outputStentenceMistake.append("Błędny format łańcucha nukleotydów");
                return outputStentenceMistake;
            }

            switch (inputSentence.charAt(i)){
                case 'T':
                    outputStentence.append('A');
                    break;
                case 'A':
                    outputStentence.append('T');
                    break;
                case 'C':
                    outputStentence.append('G');
                    break;
                case 'G':
                    outputStentence.append('C');
                    break;
            }
        }

        return outputStentence;

        // niestety nie działa
        // String outputSentence = inputSentence.replace("T","A").replace("A","T")
        //                                      .replace("C","G").replace("G","C");
    }
}
