package ru.netology;

import java.util.Iterator;
import java.util.Random;
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
        return new MySuperPuperIterator();
    }

    public class MySuperPuperIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return new Random().nextInt(max - min + 1) + min;
        }
    }
}