package se.iths.Uppgifter.Generics.Uppgift6och7;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        length = 0;
    }
    public void insertAtBeginning(int data){
        Node temp = new Node(data);
        if (head ==null){
            head = temp;
            tail = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        length++;
    }
    public void insertAtEnd(int data){
        Node temp = new Node(data);
        if(tail == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        length++;
    }
    public void insertAtPosition(int data, int position){
        Node temp = new Node(data);
        if (position == 1)
            insertAtBeginning(data);
        else{
            Node current = head;
            int currPos = 1;
            while(current != null && currPos < position){
                current = current.next;
                currPos++;
            }
            if (current == null)
                insertAtEnd(data);
            else{
                temp.next = current;
                temp.prev = current.prev;
                current.prev.next = temp;
                current.prev = temp;
                length++;
            }
        }
    }
    public void deleteAtBeginning(){
        if (head != null){
            if(head == tail){
                head = null;
                tail = null;
            }else{
                Node temp = head;
                head = head.next;
                head.prev = null;
                temp.next =null;
            }
            length--;
        }
    }
    public void deleteAtEnd(){
        if (tail != null){
            if(head == tail){
                head = null;
                tail = null;
            }else{
                Node temp = tail;
                tail = tail.prev;
                tail.next = null;
                temp.prev = null;
            }
            length--;
        }
    }
    public void delete(int pos){
        if(head != null){
            if(pos == 1){
                deleteAtBeginning();
            }else {
                Node current = head;
                int count = 1;
                while(current != null && count != pos){
                    current = current.next;
                    count++;
                }
                if (current == null){
                    System.out.println("Position wrong");
                } else if (current == tail) {
                    deleteAtEnd();
                }else{
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    current.prev = null;
                    current.next = null;
                    length--;
                }
            }
        }

    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int size() {
        return length;
    }
    static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    static void displayReverse(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }
    public void traverseForward(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void traverseBackward(){
        Node current = tail;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoubleLinkedList d = new DoubleLinkedList();
        d.insertAtBeginning(34);
        d.insertAtEnd(4);
        d.insertAtBeginning(35);
        d.insertAtEnd(5);
        d.insertAtBeginning(36);
        d.insertAtEnd(6);
        d.traverseForward();
        d.traverseBackward();
        d.insertAtPosition(7,3);
        d.insertAtPosition(37,6);
        d.traverseForward();
        d.traverseBackward();
        display(d.head);
        d.deleteAtBeginning();
        d.deleteAtEnd();
        d.delete(2);

        d.traverseForward();
        d.traverseBackward();
        displayReverse(d.tail);
    }
}
