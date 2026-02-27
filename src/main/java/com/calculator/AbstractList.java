package com.calculator;

/**
 * 
 *
 * @param <T>
 */
public abstract class AbstractList<T> implements IList<T> {
    protected int count;

    public AbstractList() {
        count = 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
