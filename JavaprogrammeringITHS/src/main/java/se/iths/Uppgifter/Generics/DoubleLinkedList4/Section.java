package se.iths.Uppgifter.Generics.DoubleLinkedList4;

public class Section {
    private int data;
    private Section next;
    private Section prev;

    public Section(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Section getNext() {
        return next;
    }

    public void setNext(Section next) {
        this.next = next;
    }

    public Section getPrev() {
        return prev;
    }

    public void setPrev(Section prev) {
        this.prev = prev;
    }
}
