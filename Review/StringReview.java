package Review;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringReview {

    public static void main(String[] args) throws IOException {
//        System.out.println(isPalidrom("kajak. -,mam mam kajak."));
//        System.out.println(isAnagram("Tom Marvolo Riddle", "I am Lord Voldemort"));
//        patenthesis("3*(2+2)()) - ((1/2))");
//        dnaChain("ATCGGACTT C");

        surnames();


    }

    public static void surnames () throws IOException {
        List<List<String>> records = new ArrayList<>();

        String path = "C:\\Users\\wojci\\Downloads\\MOCK_DATA.csv";

        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String variable;
            while((variable = reader.readLine()) != null){
                String[] oneRecord = variable.split(",");
                records.add(Arrays.asList(oneRecord));
            }
        }

        records.stream()
                .map(record -> record.get(2))
                .collect(Collectors.toList())
                .forEach(s-> System.out.println(s));

    }

    public static String dnaChain(String chain){
        Pattern pattern = Pattern.compile("[TCGA ]*");
        if(!pattern.matcher(chain.toUpperCase().replace("","")).matches()){
            System.out.println("This DNA chain is not correct");
            throw new IllegalArgumentException();
        }

        char[] chars = chain.toUpperCase().toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'C'){
                builder.append("G");
            } else if (chars[i] == 'G'){
                builder.append("C");
            } else if (chars[i] == 'A'){
                builder.append("T");
            } else if (chars[i] == 'T'){
                builder.append("A");
            }
        }
        System.out.println(builder.toString());

        return builder.toString();
    }

    public static boolean isPalidrom (String text){
        String repleced = text.toLowerCase()
                .replace(" ", "")
                .replace(",", "")
                .replace("-", "")
                .replace(".", "");

        char[] chars = repleced.toCharArray();

        StringBuilder builde = new StringBuilder();

        for (int i = chars.length - 1; i >= 0 ; i--) {
            builde.append(chars[i]);
        }

        return repleced.equals(builde.toString());
    }

    public static boolean isAnagram(String text1, String text2){
        char[] chars1 = text1.toLowerCase().replace(" ", "")
                .replace(",", "")
                .replace(".", "")
                .replace("-", "")
                .toCharArray();

        char[] chars2 = text2.toLowerCase().replace(" ", "")
                .replace(",", "")
                .replace(".", "")
                .replace("-", "")
                .toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        System.out.println(String.valueOf(chars1));
        System.out.println(String.valueOf(chars2));

        return Arrays.equals(chars1, chars2);
    }

    public static void patenthesis(String text){
        char[] chars = text.toCharArray();

        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if (String.valueOf(chars[i]).equals("(")){
                counter++;
            }
            if (counter == 0 && String.valueOf(chars[i]).equals(")")){
                throw new IllegalArgumentException("Patenthesis can not start with \")\"");
            }
            if (String.valueOf(chars[i]).equals(")")){
                counter--;
            }
        }

        if (counter == 0){
            System.out.println("Amount of patenthesis is right");
        } else {
            System.out.println("Amount of patenthesis is not right");
        }
    }
}
