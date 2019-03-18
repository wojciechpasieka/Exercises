package Review;

public class Condition {

    public static void main(String[] args) {

        isAdult(23);
        isMan("Wojtek");
    }

    private static boolean isAdult(int age){
        if (age >= 18){
            System.out.println("Ta osoba jest pełnoletnia");
            return true;
        } else {
            System.out.println("Ta osobe nie jest pełnoletnia");
            return false;
        }
    }

    private static boolean isMan(String name){
        if(name.endsWith("a")){
            System.out.println("Ta osoba ma imie żeńskie");
            return false;
        } else{
            System.out.println("Ta osoba ma imię męskie");
            return true;
        }
    }
}
