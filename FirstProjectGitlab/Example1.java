package FirstProjectGitlab;

public class Example1 {

    static boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    enum Color {
        RED, YELLOW, GREEN, BLUE
    }

    static String trafficLights(Color color) {
        switch (color) {
            case RED:
                return "Stop!";
            case GREEN:
                return "Go!";
            case YELLOW:
                return "Prepare";
            default:
                return "Unknown color";
        }
    }

    static String trafficLights2(Color color) {
        String message;
        switch (color) {
            case RED:
                message = "Stop!";
                return message;
            case GREEN:
                message = "Go!";
                return message;
            case YELLOW:
                message = "Prepare";
                break;
            default:
                message = "Unknown color";
        }
        return message;
    }
    //w Switchu po każdym "case" musi być return albo break, żeby działało poprawnie!

    public static void main(String[] args) {
        System.out.println(trafficLights(Color.RED));
        System.out.println(trafficLights2(Color.GREEN));
        System.out.println(trafficLights2(Color.YELLOW));
        System.out.println(trafficLights2(Color.BLUE));
        System.out.println(isAdult(19));

        System.out.println("\n");//nowy wiersz
        System.out.println("\t");//tabulator
        System.out.println("\\");//backslash
        System.out.println("\"");//double quote

    }
}
