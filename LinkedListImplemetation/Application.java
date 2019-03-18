package LinkedListImplemetation;

public class Application {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println();

        list.print();
        System.out.println("Element o podanym indeksie to: " + list.get(0));
        list.find(3);
        System.out.println("Podany element ma indeks: " + list.find(5));
    }

}
