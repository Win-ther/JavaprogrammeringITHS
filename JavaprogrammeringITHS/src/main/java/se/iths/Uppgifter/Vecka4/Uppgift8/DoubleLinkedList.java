package se.iths.Uppgifter.Vecka4.Uppgift8;


public class DoubleLinkedList {
    private Node first;
    private Node last;
    private int size;


    public DoubleLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void addAtFirstPos(Node node) {
        if (first == null) {
            first = node;
            last = node;
        } else {
            node.setNext(first);
            first.setPrev(node);
            first = node;
        }
        size++;
    }

    public void addAtFirstPos(int data) {
        addAtFirstPos(new Node(data));
    }

    public void addAtLastPos(Node node) {
        if (last == null) {
            first = node;
            last = node;
        } else {
            node.setPrev(last);
            last.setNext(node);
            last = node;
        }
        size++;
    }

    public void addAtLastPos(int data) {
        addAtLastPos(new Node(data));
    }

    public void addAtIndex(Node node, int index) {
        Node current = first;
        int currentIndex = 1;
        while (current != null && currentIndex < index) {
            current = current.getNext();
            currentIndex++;
        }
        if (current == null)
            addAtLastPos(node);
        else {
            node.setNext(current.getNext());
            node.setPrev(current);
            current.getNext().setPrev(node);
            current.setNext(node);
            size++;
        }
    }

    public void addAtIndex(int data, int index) {
        if (index <= 0)
            throw new IndexOutOfBoundsException("Incorrect index");
        if (index == 1)
            addAtFirstPos(new Node(data));
        else {
            addAtIndex(new Node(data), index);
        }
    }

    public void removeAtFirst() {
        if (first != null) {
            if (first == last) {
                first = null;
                last = null;
            } else {
                Node temp = first;
                first = first.getNext();
                first.setPrev(null);
                temp.setNext(null);
            }
            size--;
        }
    }

    public void removeAtLast() {
        if (last != null) {
            if (first == last) {
                first = null;
                last = null;
            } else {
                Node temp = last;
                last = last.getPrev();
                last.setNext(null);
                temp.setPrev(null);
            }
            size--;
        }
    }

    public void removeNode(Node node) {
        if (node != null) {
            if (first == last) {
                first = null;
                last = null;
            } else {
                node.getNext().setPrev(node.getPrev());
                node.getPrev().setNext(node.getNext());
                node.setNext(null);
                node.setPrev(null);
            }
            size--;
        }
    }

    public void removeAtIndex(int index) {
        if (index == 1)
            removeAtFirst();
        else if (index == size)
            removeAtLast();
        else {
            Node current = first;
            int currentIndex = 1;
            while (current != null && currentIndex != index) {
                current = current.getNext();
                currentIndex++;
            }
            if (current == null)
                throw new IndexOutOfBoundsException("Invalid index");
            else {
                current.getNext().setPrev(current.getPrev());
                current.getPrev().setNext(current.getNext());
                current.setNext(null);
                current.setPrev(null);
                size--;
            }
        }
    }

    public void printList() {
        Node current = first;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    public void findNode(Node findThis) {
        Node current = first;
        int currentIndex = 1;
        while (current != findThis && currentIndex != size) {
            current = current.getNext();
            currentIndex++;
        }
        if (current == findThis)
            System.out.println("Found node with value " +current.getData());
        else
            System.out.println("Did not find node");
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addAtFirstPos(45);
        list.addAtFirstPos(54);
        list.addAtLastPos(56);
        list.addAtLastPos(77);
        Node node = new Node(367);
        list.addAtIndex(node, 3);
        list.printList();
        list.findNode(node);
        list.removeNode(node);
        list.printList();
        list.findNode(node);
        list.removeAtLast();
        list.removeAtFirst();
        list.addAtFirstPos(34);
        list.addAtLastPos(778);
        list.printList();
        list.removeAtIndex(3);
        list.printList();
    }
}
