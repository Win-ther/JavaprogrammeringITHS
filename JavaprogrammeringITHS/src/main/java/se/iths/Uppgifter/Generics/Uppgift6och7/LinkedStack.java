package se.iths.Uppgifter.Generics.Uppgift6och7;

import java.util.EmptyStackException;

public class LinkedStack {
    private int length;
    private Node top;
    public LinkedStack() {
        length = 0;
        top = null;
    }
    public void push(int data){
        Node temp = new Node(data);
        temp.setNext(top);
        top = temp;
        length++;
    }
    public int pop() throws EmptyStackException{
        if (isEmpty())
            throw new EmptyStackException();
        int result = top.getData();
        top = top.getNext();
        length--;
        return result;
    }
    public int peek() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        return top.getData();
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public int size(){
        return length;
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        Node current = top;
        while(current!= null){
            result.append(current.toString()).append("\n");
            current = current.getNext();
        }
        return result.toString();
    }

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(1);
        stack.push(5);
        stack.push(37);
        stack.push(4);
        stack.push(3);
        System.out.println(stack.toString());
        System.out.println("Size of stack is: "+stack.size());
        stack.pop();
        stack.pop();
        System.out.println("Size of stack is: "+stack.size());
        System.out.println(stack.toString());
    }
}
