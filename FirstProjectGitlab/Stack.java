package FirstProjectGitlab;

public class Stack {

    static final int STACK_SIZE = 10;

    int size;
    int index = 0;
    int[] array;

    public Stack(int size) {
        this.size = size;
        array = new int[size];
    }

    public void push (int n){
        if (index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }else {
            array[index] = n;
            index++;
        }
    }

    public int pop(){

        if (index > 0) {
            index--;
            return array[index];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
