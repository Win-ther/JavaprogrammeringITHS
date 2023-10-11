package se.iths.Uppgifter.Generics.DoubleLinkedList4;

public class Snake {
    private Section head;
    private Section tail;
    private int length;

    public Snake() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void addHead(int data) {
        Section temp = new Section(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.setNext(head);
            head.setPrev(temp);
            head = temp;
        }
        length++;
    }
    public void addTail(int data){
        Section temp = new Section(data);
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
    public void addAtThisPos(int data, int pos){
        if (pos == 1){
            addHead(data);
        }else{
            Section temp = new Section(data);
            Section current = head;
            int currPos = 1;
            while (current != null && currPos < pos){
                current = current.getNext();
                currPos++;
            }
            if (current == null){
                addTail(data);
            }else {
                temp.setNext(current.getNext());
                temp.setPrev(current);
                current.getNext().setPrev(temp);
                current.setNext(temp);
                length++;
            }
        }
    }
    public void killHead(){
        if (head != null) {
            if (head == tail){
                head = null;
                tail = null;
            }else {
                Section temp = head;
                head = head.getNext();
                head.setPrev(null);
                temp.setNext(null);
            }
            length--;
        }
    }
    public void killTail(){
        if (tail != null){
            if (head == tail){
                head = null;
                tail = null;
            }else {
                Section temp = tail;
                tail = tail.getPrev();
                tail.setNext(null);
                temp.setPrev(null);
            }
            length--;
        }
    }
    public void killAtThisPos(int pos){
        if (pos == 1){
            killHead();
        } else if (pos == length) {
            killTail();
        }else {
            if (pos <= length/2){
                posBelowHalf(pos);
            }else {
                posAboveHalf(pos);
            }
        }
    }
    private void posBelowHalf(int pos){
        Section current = head;
        int currPos = 1;
        while (current != null && currPos != pos){
            current = current.getNext();
            currPos++;
        }
        removeCurrent(current);
    }

    private void removeCurrent(Section current) {
        if (current == null){
            System.out.println("Incorrect position");
        }else{
            current.getNext().setPrev(current.getPrev());
            current.getPrev().setNext(current.getNext());
            current.setNext(null);
            current.setPrev(null);
            length--;
        }
    }
    private void posAboveHalf(int pos){
        Section current = tail;
        int currPos = length;
        while(current != null && currPos != pos){
            current = current.getPrev();
            currPos--;
        }
        removeCurrent(current);
    }
    static void snakeFromHead(Section head){
        Section current = head;
        System.out.print("SNAKE ");
        while (current != null){
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }
    static void snakeFromTail(Section tail){
        Section current = tail;
        System.out.print("EKANS ");
        while (current != null){
            System.out.print(current.getData() + " -> ");
            current = current.getPrev();
        }
        System.out.println("NULL");
    }
    public Section getHead() {
        return head;
    }

    public Section getTail() {
        return tail;
    }

    public int size() {
        return length;
    }

    public static void main(String[] args) {
        Snake s = new Snake();

        s.addHead(34);
        s.addTail(4);
        s.addHead(35);
        s.addTail(5);
        s.addHead(36);
        s.addTail(6);
        snakeFromHead(s.head);
        s.addAtThisPos(7,0);
        s.addAtThisPos(37,6);
        snakeFromHead(s.head);
        s.killAtThisPos(2);
        s.killAtThisPos(s.length-2);
        snakeFromHead(s.head);
        snakeFromTail(s.tail);
        s.killHead();
        s.killTail();
        snakeFromHead(s.head);
        snakeFromTail(s.tail);
    }
}
