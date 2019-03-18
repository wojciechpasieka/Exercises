package FirstProjectGitlab;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8}, {9, 10}, {11, 12, 13, 14}};
        int[][] array2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array3 = {{1, 2, 3, 4, 5, 6}, {7, 8, 9}};

        System.out.println("point D: " + pointD(array));
        System.out.println("point E: " + pointE(array));
        System.out.println("point F: " + pointF(array, 9));

        //pointG- łączenie tablicy
        System.out.println("Point G: ");
        pointG(array1);

        //point H- dzielenie tablicy
        System.out.println("Point H: ");
        pointH(array);

        //point I- merge tablicy
        System.out.println("Point I: ");
        pointI(array2);


        //point J
        System.out.println("Point J: ");
        pointJ(array3);

//        for (int i = 0; i < array.length; i++) {
//            //System.out.print(array[i] + "  ");
//        }
//        //System.out.println();
//        for (int i = array.length - 1; i >= 0; i--) {
//            //System.out.print(array[i] + "  ");
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                //System.out.print(array[i] + "  ");
//            }
//        }


    }

    public static int pointD(int[] array) {
        //suma elementów tabeli
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }

    public static int pointE(int[] array) {
        // ile liczb jest mniejszych
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 5) {
                counter++;
            }
        }
        return counter;
    }

    public static int pointF(int[] array, int number) {
        //ile razy występuje podana liczba
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] pointG(int[][] array) {
        //łączenie/spłaszczanie  tablic w jedną
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            size += array[i].length;
        }
        int[] connectedArray = new int[size];

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                connectedArray[index] = array[i][j];
                index++;
            }
        }
        System.out.println();

        for (int i = 0; i < connectedArray.length ; i++) {
            System.out.print(connectedArray[i] + " ");
        }
        System.out.println();

        return connectedArray;
    }

    public static int[][] pointH(int[] array) throws IllegalArgumentException {
        if (array.length % 2 == 0) {
            int[][] dividedArray = new int[array.length / 2][2];
            int index = 0;

            for (int i = 0; i < dividedArray.length; i++) {
                for (int j = 0; j < 2; j++) {
                    dividedArray[i][j] = array[index];
                    index++;
                }
            }

            for (int i = 0; i < dividedArray.length ; i++) {
                System.out.println();
                for (int j = 0; j <dividedArray[i].length ; j++) {
                    System.out.print(dividedArray[i][j] + " ");
                }
            }
            System.out.println();
            return dividedArray;

        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int[][] pointI(int[][] array) throws IllegalArgumentException {

        if (array[0].length == array[1].length && array.length == 2) {

            int[][] mergedArrays = new int[array[1].length][2];
            int[] firstArray = array[0];
            int[] secondArray = array[1];
            for (int i = 0; i < firstArray.length; i++) {
                mergedArrays[i][0] = firstArray[i];
                mergedArrays[i][1] = secondArray[i];
            }
            for (int i = 0; i < mergedArrays.length; i++) {
                System.out.println();
                for (int j = 0; j < mergedArrays[i].length; j++) {
                    System.out.print(mergedArrays[i][j] + " ");
                }
            }
            System.out.println();
            return mergedArrays;

        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int[][] pointJ(int[][] array) throws IllegalArgumentException {
        if (array.length == 2) {
            int[] shorterArray;
            int[] longerArray;

            if (array[0].length < array[1].length) {
                shorterArray = array[0];
                longerArray = array[1];
            } else {
                shorterArray = array[1];
                longerArray = array[0];
            }

            int[][] newArray = new int[longerArray.length][2];

            for (int i = 0; i < longerArray.length; i++) {
                newArray[i][0] = longerArray[i];
                newArray[i][1] = shorterArray[i % shorterArray.length];
            }

            for (int i = 0; i < newArray.length; i++) {
                System.out.println();
                for (int j = 0; j < newArray[i].length; j++) {
                    System.out.print(newArray[i][j] + " ");

                }
            }
            System.out.println();
            return newArray;

        } else {
            throw new IllegalArgumentException();
        }

    }

}
