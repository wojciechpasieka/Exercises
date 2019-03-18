package Algorytmy;

public class Euclid {

    public static void main(String[] args) {
        System.out.println(euclides(100, 13));

        System.out.println(euclides2(16, 64));

    }

    public static int euclides(int a, int b) {

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }


    public static int euclides2(int a, int b){
        int c;
        while (b != 0){
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
