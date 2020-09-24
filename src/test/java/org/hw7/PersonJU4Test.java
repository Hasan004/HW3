package org.hw7;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonJU4Test {

    @Test(expected = PersonDiedException.class)
    public void testDie() throws PersonDiedException {
        Person p = new Person("jan", 129);

        p.getAge();

        // then
        // assert??
    }
}