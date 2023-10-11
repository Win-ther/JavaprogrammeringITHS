package se.iths.Uppgifter.Generics.DoubleLinkedListPractise2;

public class LinkedListDouble {
    private Node head;
    private Node tail;
    private int length;

    public LinkedListDouble() {
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
            head.setPrev(temp);
            temp.setNext(head);
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
            tail.setNext(temp);
            temp.setPrev(tail);
            tail = temp;
        }
    }
    public void addAtPos(int data, int pos){
        if (pos <= 0){
            pos = 1;
        }
        if (pos == 1){
            addAtHead(data);
        }else {
            Node current = head;
            int currentPos = 1;
            while (current != null && currentPos < pos){
                current = current.getNext();
                currentPos++;
            }
            if (current == null){
                addAtTail(data);
            }else {
                Node temp = new Node(data);
                temp.setNext(current.getNext());
                temp.setPrev(current);
                current.getNext().setPrev(temp);
                current.setNext(temp);
                length++;
            }
        }
    }
    public void deleteAtHead(){
        if (head != null){
            if (head == tail){
                head = null;
                tail = null;
            }else {
                Node temp = head;
                head = head.getNext();
                head.setPrev(null);
                temp.setNext(null);
            }
            length--;
        }
    }
    public void deleteAtTail(){
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
    public void deleteAtPos(int pos){
        if (pos == 1){
            deleteAtHead();
        }else{
            Node current = head;
            int currPos = 1;
            while (current != null && currPos != pos){
                current = current.getNext();
                currPos++;
            }
            if(current == null){
                System.out.println("Incorrect position entered");
            }else if (current == tail){
                deleteAtTail();
            }else{
                current.getNext().setPrev(current.getPrev());
                current.getPrev().setNext(current.getNext());
                current.setNext(null);
                current.setPrev(null);
                length--;
            }
        }
    }
    static void printHtoT(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData() +" -> " );
            temp = temp.getNext();
        }
        System.out.println("NULL");
    }
    static void printTtoH(Node tail){
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.getData() + " -> ");
            temp = temp.getPrev();
        }
        System.out.println("NULL");
    }
    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int size() {
        return length;
    }

    public static void main(String[] args) {
        LinkedListDouble d = new LinkedListDouble();
        d.addAtHead(4);
        d.addAtTail(6);
        d.addAtHead(3);
        d.addAtTail(7);
        d.addAtHead(2);
        d.addAtTail(8);
        d.addAtHead(1);
        d.addAtTail(9);
        printHtoT(d.head);
        d.addAtPos(5,4);
        printHtoT(d.head);
        d.deleteAtHead();
        d.deleteAtTail();
        d.deleteAtPos(4);
        printHtoT(d.head);
        printTtoH(d.tail);
    }
}
