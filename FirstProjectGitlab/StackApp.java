package FirstProjectGitlab;

public class StackApp {
    public static void main(String[] args) {
        Stack stack = new Stack(10);


        try {
            stack.push(5);
            stack.push(6);
            stack.push(7);

            System.out.println(stack.pop()); //7
            System.out.println(stack.pop()); //6
            System.out.println(stack.pop()); //5
            System.out.println(stack.pop()); //5
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Błąd w sztuce");
        }

    }
}
