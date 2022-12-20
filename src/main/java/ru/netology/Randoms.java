package ru.netology;

import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class Randoms implements Iterable<Integer> {
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            return randomNum;
        }
    }
}