package Tree;

public class Tree {
    Node root;

    void add(int val) {
        Node nodeToInsert = new Node();
        nodeToInsert.value = val;

        if (root == null) {
            root = nodeToInsert;
        } else {
            Node current = root;
            while (true) {
                if (val < current.value) {
                    if (current.left == null) {
                        current.left = nodeToInsert;
                        break;
                    } else {
                        current = current.left;
                    }
                } else {
                    if (current.right == null){
                        current.right = nodeToInsert;
                    } else {
                        current = current.right;
                    }

                }
            }
        }
    }
}
