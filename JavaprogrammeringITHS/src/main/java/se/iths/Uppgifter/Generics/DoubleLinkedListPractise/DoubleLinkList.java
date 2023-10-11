package se.iths.Uppgifter.Generics.DoubleLinkedListPractise;
public class DoubleLinkList {
    private Node head;
    private Node tail;
    private int length;

    public DoubleLinkList() {
        head = null;
        tail = null;
        length = 0;
    }
    public void addAtHead(int data){
        Node temp = new Node(data);
        if(head == null){
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
        if (index == 1){
            addAtHead(data);
        }else{
            Node temp = new Node(data);
            Node current = head;
            int currPos = 1;
            while(current != null && currPos < index){
                    current = current.getNext();
                    currPos++;
            }
            if(current == null){
                addAtTail(data);
            }else{
                temp.setNext(current);
                temp.setPrev(current.getPrev());
                current.getPrev().setNext(temp);
                current.setPrev(temp);
                length++;
            }
        }
    }
    public void removeAtHead(){
        if(head != null){
            if(head == tail){
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
    public void removeAtEnd(){
        if (tail != null){
            if(head == tail){
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
        if (index == 1){
            removeAtHead();
        }else{
            Node current = head;
            int currPos = 1;
            while(current != null && currPos != index){
                current = current.getNext();
                currPos++;
            }
            if(current == null){
                System.out.println("Incorrect index given");
            }else if(current == tail){
                removeAtEnd();
            }else{
                current.getPrev().setNext(current.getNext());
                current.getNext().setPrev(current.getPrev());
                current.setNext(null);
                current.setPrev(null);
                length--;
            }
        }
    }
    static void printHeadtoTail(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("Null");
    }
    static void printTailtoHead(Node tail){
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getPrev();
        }
        System.out.println("Null");
    }
    public int size(){
        return length;
    }


















    public static void main(String[] args) {
        DoubleLinkList d = new DoubleLinkList();
        d.addAtHead(34);
        d.addAtTail(4);
        d.addAtHead(35);
        d.addAtTail(5);
        d.addAtHead(36);
        d.addAtTail(6);
        printHeadtoTail(d.head);
        d.addAtIndex(7,0);
        d.addAtIndex(37,6);
        printHeadtoTail(d.head);
        d.removeAtHead();
        d.removeAtEnd();
        d.removeAtIndex(2);
        printHeadtoTail(d.head);
        printTailtoHead(d.tail);
    }
}
