package se.iths.Uppgifter.Vecka5.Uppgift7;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private Node head;

    public BinaryTree() {
        this.head = null;
    }
    private Node addRecursive(Node current, int data){
        if (current == null)
            return new Node(data);

        if (data < current.getData())
            current.setLeft(addRecursive(current.getLeft(),data));
        else if (data > current.getData())
            current.setRight(addRecursive(current.getRight(), data));
        else
            return current;

        return current;
    }
    private void add(int data){
        head = addRecursive(head,data);
    }
    private boolean containsNodeR(Node current, int data){
        if (current == null)
            return false;
        if (data == current.getData())
            return true;
        return data < current.getData() ? containsNodeR(current.getLeft(),data) : containsNodeR(current.getRight(), data);
    }
    public boolean containsNode(int data){
        return containsNodeR(head,data);
    }
    private Node deleteR(Node current, int data){
        if (current == null)
            return null;
        if (data == current.getData()){
            if (current.getLeft() == null && current.getRight() == null)
                return null;
            if (current.getRight() == null)
                return current.getLeft();
            if (current.getLeft() == null)
                return current.getRight();
            int smallestValue = findSmallestValue(current.getRight());
            current.setData(smallestValue);
            current.setRight(deleteR(current.getRight(),smallestValue));
            return current;
        }
        if (data < current.getData()){
            current.setLeft(deleteR(current.getLeft(),data));
            return current;
        }
        current.setRight(deleteR(current.getRight(),data));
        return current;
    }
    private int findSmallestValue(Node head){
        return head.getLeft() == null ? head.getData() : findSmallestValue(head.getLeft());
    }
    public void delete(int data){
        head = deleteR(head,data);
    }
    public void traverseInOrder(Node node){
        if (node != null){
            traverseInOrder(node.getLeft());
            System.out.print(node.getData() + " -> ");
            traverseInOrder(node.getRight());
        }
    }
    public void traversePreOrder(Node node){
        if (node != null){
            System.out.print(node.getData() + " -> ");
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
        }
    }
    public void traversePostOrder(Node node){
        if (node != null){
            traversePostOrder(node.getLeft());
            traversePostOrder(node.getRight());
            System.out.print(node.getData() + " -> ");
        }
    }
    public void traverseLevelOrder(){
        if (head != null) {
            Queue<Node> nodes = new LinkedList<>();
            nodes.add(head);
            while (!nodes.isEmpty()){
                Node node = nodes.remove();
                System.out.print(node.getData() + " -> ");
                if (node.getLeft() != null)
                    nodes.add(node.getLeft());
                if (node.getRight() != null)
                    nodes.add(node.getRight());
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
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

        tree.traverseInOrder(tree.head);
        System.out.println();
        tree.traversePreOrder(tree.head);
        System.out.println();
        tree.traversePostOrder(tree.head);
        System.out.println();
        tree.traverseLevelOrder();
    }
}
