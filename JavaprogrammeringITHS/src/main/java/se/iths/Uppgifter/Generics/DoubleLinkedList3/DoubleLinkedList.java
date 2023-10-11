package se.iths.Uppgifter.Generics.DoubleLinkedList3;
public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public void addAtHead(int data){
        Node temp = new Node(data);
        if (head == null){
            head = temp;
            tail = temp;
        }else{
            temp.setNext(head);
            head.setPrev(temp);
            head = temp;
        }
        length++;
    }
    public void addAtTail(int data){
        Node temp = new Node(data);
        if (tail == null){
            head = temp;
            tail = temp;
        }else{
            temp.setPrev(tail);
            tail.setNext(temp);
            tail = temp;
        }
        length++;
    }
    public void addAtIndex(int data, int index){
        Node temp = new Node(data);
        if (index == 1)
            addAtHead(data);
        else{
            Node current = head;
            int currPos = 1;
            while (current != null && currPos < index){
                current = current.getNext();
                currPos++;
            }
            if (current == null)
                addAtTail(data);
            else{
                temp.setNext(current.getNext());
                temp.setPrev(current);
                current.getNext().setPrev(temp);
                current.setNext(temp);
                length++;
            }
        }
    }
    public void removeHead(){
        if (head != null){
            if (head == tail){
                head = null;
                tail = null;
            }else{
                Node temp = head;
                head = head.getNext();
                head.setPrev(null);
                temp.setNext(null);
            }
            length--;
        }
    }
    public void removeTail(){
        if (tail != null){
            if (head == tail){
                head = null;
                tail = null;
            }else{
                Node temp = tail;
                tail = tail.getPrev();
                tail.setNext(null);
                temp.setPrev(null);
            }
            length--;
        }
    }
    public void removeAtIndex(int index){
        if (index == 1)
            removeHead();
        else if (index <= length/2)
            indexAtFirstHalf(index);
        else if(index == length)
            removeTail();
        else
            indexAtSecondHalf(index);
    }
    private void indexAtFirstHalf(int index){
        Node current = head;
        int currentPos = 1;
        while (current != null && currentPos != index){
            current = current.getNext();
            currentPos++;
        }
        setCurrent(current);
    }
    private void indexAtSecondHalf(int index){
        Node current = tail;
        int currentPos = length;
        while (current != null && currentPos != index){
            current = current.getPrev();
            currentPos--;
        }
        setCurrent(current);
    }
    private void setCurrent(Node current){
        if(current == null){
            System.out.println("Incorrect index given, not removing anything");
        }else{
            current.getNext().setPrev(current.getPrev());
            current.getPrev().setNext(current.getNext());
            current.setNext(null);
            current.setPrev(null);
            length--;
        }
    }
    public Node getHead() {
        return head;
    }
    static void printStartHead(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.getData()+" -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }
    static void printStartTail(Node tail){
        Node current = tail;
        while (current != null){
            System.out.print(current.getData()+" -> ");
            current = current.getPrev();
        }
        System.out.println("NULL");
    }
    public Node getTail() {
        return tail;
    }

    public int size() {
        return length;
    }

    public static void main(String[] args) {
        DoubleLinkedList d = new DoubleLinkedList();
        d.addAtHead(34);
        d.addAtTail(4);
        d.addAtHead(35);
        d.addAtTail(5);
        d.addAtHead(36);
        d.addAtTail(6);
        printStartHead(d.head);
        d.addAtIndex(7,0);
        d.addAtIndex(37,6);
        printStartHead(d.head);
        d.removeAtIndex(2);
        d.removeAtIndex(d.length-2);
        printStartHead(d.head);
        printStartTail(d.tail);
    }
}
