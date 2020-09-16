package org.hw7;

import org.hw7.Gender;
import org.hw7.Person;
import org.hw7.PersonDiedException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonTest {

//    public PersonDiedException PersonDiedException;

    @Test
    public void testPerson(){
        //Given
        Person p = new Person("jan", 129);

        //when
        Gender resultaat1 = p.getGender();
        p.setGender(Gender.MALE);
        Gender resultaat2 = p.getGender();
        p.haveBirthday();
        int number = Person.numberOfPossibleGenders;

        //then
        assertEquals(Gender.UNKNOWN, resultaat1);
        assertEquals(Gender.MALE, resultaat2);
        assertEquals(3, number);

    }

    @Test
    public void persondiedexception() {
        Person p = new Person("jan", 129);

        assertThrows(PersonDiedException.class,  () -> p.getAge());

    }

}
