package org.lab5;

public class Main {
    public static void main(String[] args) {

        Great h = new Great();
        System.out.println(h.greatest(21,20));
        System.out.println(h.greatest("hoi", "b"));
        System.out.println(h.greatest(20, 30, 40, 50));
        System.out.println(h.factorial(5));

    }

}
