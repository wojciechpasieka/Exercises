package LinkedListImplemetation;

public class LinkedList {
    Node start;

    void add(int n) {
        if (start == null) {
            start = new Node();
            start.value = n;
        } else {
            Node node = new Node();
            node.value = n;
            Node current = start;

            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    void print(){

        Node current = start;
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    int get(int index)throws IndexOutOfBoundsException{
        //zwraca element o podanym indeksie
        if (start == null || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }

        int counter = 0;
        Node current = start;
        while (current != null){
            if (counter == index){
                return current.value;
            }
            counter++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index jest za wysoki");
    }

    int find (int number){
        int counter = 0;
        Node current = start;
        while (current != null){
            if (current.value == number){
                return counter;
            }
            counter++;
            current = current.next;
        }
        System.out.println("Podany element nie istnieje");
        return -1;
    }

    void remove (int index){
        //usuwa numer o podanym indeksie
        if (start == null){
            throw new ArrayIndexOutOfBoundsException(index);
        }

        if (index == 0){
            start = start.next;
        } else {
            int i =0;
            Node current = start;

            while(current != null && i < index - 1){
                i++;
                current = current.next;
            }

            if (i == index - 1){
                //znalezlismy element poprzedzajacy
                if(current.next == null){
                    throw new ArrayIndexOutOfBoundsException();
                } else {
                    //Node elementToDelete = current.next;
                    //current.next = elementToDelete.next;
                    current.next = current.next.next;
                    //przypisujemy do poprzedzajacego elementu referencje do elementu nastepujacego po tym usunietym
                }
            } else {
                throw new ArrayIndexOutOfBoundsException(index);
                }
            }
        }

    }
