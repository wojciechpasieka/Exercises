package Algorytmy;

public class NWW {
    public static void main(String[] args) {

        System.out.println(nwd(5,4));
    }
    public static int nwd(int x, int y) {
        while (x != y) {
            if (x > y)
                x -= y;
            else
                y -= x;
        }
        return x;
    }
}
