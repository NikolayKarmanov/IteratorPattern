package ru.netology;

import java.util.Iterator;

public class Randoms implements Iterable<String> {

    public Randoms() {
    }

    @Override
    public Iterator<String> iterator() {
        return new MySuperPuperIterator();
    }

    public class MySuperPuperIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public String next() {
            return new Person().toString();
        }
    }
}