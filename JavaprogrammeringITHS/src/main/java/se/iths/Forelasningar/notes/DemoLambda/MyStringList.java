package se.iths.Forelasningar.notes.DemoLambda;

import java.util.*;

public class MyStringList implements List<String> {
    private String[] values = new String[10];
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
        //ToDo
    }

    @Override
    public Iterator<String> iterator() {
        return null;
        //ToDo
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
        //ToDo
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
        //ToDo
    }

    @Override
    public boolean add(String s) {
        if (s == null)
            throw new IllegalArgumentException();
        if (size >= values.length){
            this.values = Arrays.copyOf(values,values.length << 1);
        }
        values[size] = s;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        values = new String[size];
        size = 0;
    }

    @Override
    public String get(int index) {
        checkIndex(index);
        return values[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
    }

    @Override
    public String set(int index, String element) {
        return null;
    }

    @Override
    public void add(int index, String element) {

    }

    @Override
    public String remove(int index) {
        checkIndex(index);
        String temp = values[index];
        for (int i = index; i < size-1; i++) {
            values[i] = values[i+1];
        }
        values[size-1] = null;
        size--;
        return temp;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return null;
    }
}
