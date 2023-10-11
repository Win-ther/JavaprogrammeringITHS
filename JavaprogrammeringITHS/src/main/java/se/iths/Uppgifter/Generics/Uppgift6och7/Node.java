package se.iths.Uppgifter.Generics.Uppgift6och7;

public class Node {
    public Node next;
    public Node prev;
    public int data;
    public Node(){
        next = null;
        prev = null;
        data = Integer.MIN_VALUE;
    }
    public Node(int data){
        next = null;
        prev = null;
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    public String toString(){
        return Integer.toString(data);
    }
}
