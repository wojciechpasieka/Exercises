package Algorytmy;

import java.util.Arrays;

public class AlgorytmWydawaniaReszty {
    public static void main(String[] args) {

        moneyRest(37,100);

    }

    public static void moneyRest(int price, int cash) {
        int[] values = {1, 2, 5, 10, 20, 50};
        int[] amount = new int[values.length];

        int rest = cash - price;

        int i = values.length - 1;
        while (rest > 0 && i >= 0){
            while (rest < values[i]) {
                i--;
                if ( i < 0){
                    throw new IllegalStateException();
                }
            }
            rest = rest - values[i];
            amount[i]++;
        }

        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(amount));

    }
}
