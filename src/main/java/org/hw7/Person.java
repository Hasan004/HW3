package org.hw7;

public class Person {

    private String name;
    private int age;
    private Gender gender = Gender.UNKNOWN;
    public static int numberOfPossibleGenders = Gender.values().length;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int haveBirthday(){
        return age++;
    }

    public int getAge() throws PersonDiedException {
        if (age < 130) {
            return age;
        }else{
            throw new PersonDiedException("Persoon is overleden");
        }
    }
}
