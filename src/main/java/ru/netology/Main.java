package ru.netology;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (String r : new Randoms()) {
            System.out.println(r);
            count++;
            if (r.equals("Ivan Ivanov 30 years")) {
                break;
            }
        }
        System.out.println("Ivan Ivanov 30 years was found in " + count + " steps");
    }
}