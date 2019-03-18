package LinkedListImplemetation;

public class TwoDirectionList {
    static Node start;
    static Node last;
    static int size;


    static int getSize() {
        return size;
    }

    static void removeALL() {
        start = null;
        last = null;
        size = 0;
    }

    static void add(int n) {
        if (start == null){
            start = new Node();
            start.value = n;
            last = start;
        } else {
            Node newNode = new Node();
            newNode.value = n;
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
        size++;
    }

    static int getValue (int index){
        return 1;
    }
}
