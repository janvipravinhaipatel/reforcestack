package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E>  {

    ArrayList<E> delegate;

    public MyStack() {
        this.delegate = new ArrayList<>();
    }

    public boolean isEmpty(){
        return delegate.isEmpty();
    }

    public int size(){
        return delegate.size();
    }

    public void push(E e) {
        delegate.add(e);
    }

    public E pop() {
        if (this.isEmpty()) throw new EmptyStackException();
        E e = delegate.get(this.size() - 1);
        delegate.remove(this.size() - 1);
        return e;
    }

    public E top(){
        return delegate.get(this.size() - 1);
    }
}