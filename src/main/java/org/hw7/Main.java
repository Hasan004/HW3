package org.hw7;

public class Main {
    public static void main(String[] args) throws PersonDiedException {
        Person p = new Person("Jan", 120);
        System.out.println(p.getGender());
        p.setGender(Gender.MALE);
        System.out.println(p.getGender());
        p.haveBirthday();
        System.out.println(p.getAge());
        System.out.println(Person.numberOfPossibleGenders);
    }

}
