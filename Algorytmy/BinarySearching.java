package Algorytmy;

import javax.management.BadAttributeValueExpException;

public class BinarySearching {

    public static void main(String[] args) {
        int[] array = {2, 4, 5, 6, 9, 43, 48, 51};

        System.out.println(binarySearching(array, 52));

        System.out.println(binarySearchingRecursion(array, 1, 0, array.length - 1));
    }

    public static int binarySearching(int[] array, int n){

        int left = 0;
        int right = array.length - 1;

        while (left <= right){
            int centre = (left + right) / 2;
            System.out.println("Left jest teraz: " + left + " Centre jest teraz: " + centre + " Right jeste teraz: " + right);
            if (array[centre] > n){
                right = centre - 1;
            } else if (array[centre] < n){
                left = centre + 1;
            }else {
                return centre;
            }
        }
        return -1;
    }

    public static int binarySearchingRecursion(int[] array, int n, int left, int right){

        System.out.println("Left jest teraz: " + left + " a Right jest teraz: " + right);

        if (left <= right){
            int centre = (left + right) / 2;
                if (array[centre] > n){
                    return binarySearchingRecursion(array, n, left, centre - 1);
                } else if (array[centre] < n){
                    return binarySearchingRecursion(array, n, centre + 1, right);
                } else {
                    return centre;
                }
        }
        return -1;
    }
}
