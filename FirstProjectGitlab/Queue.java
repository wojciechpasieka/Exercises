package FirstProjectGitlab;

import java.util.Deque;
import java.util.LinkedList;

public class Queue {

    public static void main(String[] args) {

        Deque<Integer> lista = new LinkedList<>();

        lista.addLast(1);
        lista.addLast(2);
        lista.addLast(4);
        lista.addLast(5);
        lista.addLast(8);
        System.out.println(lista);
        System.out.println("Stan kolejki to: " + lista.toString());

        while (!lista.isEmpty()){ //wykonuj dopóki lista jest NIEpusta
            int numerPacjenta = lista.removeFirst();
            System.out.println("Przychodzi pacjent: " + numerPacjenta);

            System.out.println("Stan kolejki to: " + lista.toString());
        }
    }
}
