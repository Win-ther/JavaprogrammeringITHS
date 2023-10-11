package se.iths.Uppgifter.BinaryTreeEx;

public class Tree {
    Node head;

    public Tree() {
        head = null;
    }

    private Node addRecursive(Node current, int value) {
        if (current == null)
            return new Node(value);

        if (value < current.getValue())
            current.setLeft(addRecursive(current.getLeft(), value));
        else if (value > current.getValue())
            current.setRight(addRecursive(current.getRight(), value));
        else
            return current;

        return current;
    }
    public void add(int value) {
        head = addRecursive(head, value);
    }
    private boolean containsNodeRecursive(Node current, int value){
        if (current == null)
            return false;
        if (value == current.getValue())
            return true;

        return value < current.getValue() ? containsNodeRecursive(current.getLeft(), value) : containsNodeRecursive(current.getRight(), value);
    }

    public boolean containsNode(int value){
        return containsNodeRecursive(head,value);
    }
    private Node deleteRecursive(Node current, int value){
        if (current == null)
            return null;
        if (value == current.getValue()){
            if (current.getRight() == null && current.getLeft() == null)
                return null;
            if (current.getLeft() == null)
                return current.getRight();
            if (current.getRight() == null)
                return current.getLeft();
            int smallestValue = findSmallestValue(current);
            current.setValue(smallestValue);
            current.setRight(deleteRecursive(current.getRight(),smallestValue));
            return current;
        }
        if (value < current.getValue()) {
            current.setLeft(deleteRecursive(current.getLeft(),value));
            return current;
        }
        current.setRight(deleteRecursive(current.getRight(),value));
        return current;
    }
    private int findSmallestValue(Node head){
        return head.getLeft() == null ? head.getValue() :  findSmallestValue(head.getLeft());
    }
    public void delete(int value){
        head = deleteRecursive(head, value);
    }
    public void printInOrder(Node node){
        if (node != null){
            printInOrder(node.getLeft());
            System.out.print(node.getValue() + " -> ");
            printInOrder(node.getRight());
        }
    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);
        tree.add(29);
        tree.add(11);

        System.out.println(tree.containsNode(11));
        System.out.println(tree.containsNode(29));

        tree.delete(11);
        tree.delete(29);

        System.out.println(tree.containsNode(11));
        System.out.println(tree.containsNode(29));

        tree.printInOrder(tree.head);
        System.out.println();
    }
}
