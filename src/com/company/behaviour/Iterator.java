package com.company.behaviour;

import java.util.List;

public class Iterator<T> {

    private List<T> iteratorList;
    private int currentPos = 0;

    public Iterator(List<T> itearatorList) {
        this.iteratorList = itearatorList;
    }

    public boolean isEmpty() {
        return iteratorList.isEmpty();
    }

    public boolean hasNext() {
        return currentPos > iteratorList.size() - 1;
    }

    public T next() {
        final T object = iteratorList.get(currentPos);
        currentPos++;
        return object;
    }

    public void add(T object) {
        iteratorList.add(object);
    }

    public boolean remove(T object) {
        if (iteratorList.remove(object)) {
            if (currentPos == iteratorList.size() - 1) {
                currentPos--;
            }
            return true;
        }
        return false;
    }

}
