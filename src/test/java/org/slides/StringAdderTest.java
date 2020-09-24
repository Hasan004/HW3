package org.slides;

import org.example.StringAdder;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringAdderTest {

    @Test
    public void whenAddIsCalledWithEmptyStringItShouldReturnZero() {
        StringAdder adder = new StringAdder();
        int result = adder.add("");
        assertEquals(0, result);
    }

    @Test
    public void whenAddIsCalledWithOneItShouldReturnOne() {
        StringAdder adder = new StringAdder();
        int result = adder.add("1");
        assertEquals(1, result);
    }

    @Test
    public void whenAddIsCalledWithNegativeNumber(){
        StringAdder adder = new StringAdder();
        int result = adder.add("-1");
        assertEquals(-1, result);
    }

    @Test
    public void whenAddIsCalledWithAnLetter() throws RuntimeException{
        StringAdder adder = new StringAdder();
        assertThrows(RuntimeException.class,  () -> adder.add("a"));
    }

    @Test
    public void whenAddIsCalledWithTwoNumbers(){
        StringAdder adder = new StringAdder();
        int result = adder.add("       1,2   ");
        assertEquals(3, result);
    }

    @Test
    public void whenAddIsCalledWithHighNumbers() throws RuntimeException{
        StringAdder adder = new StringAdder();
        assertThrows(RuntimeException.class,  () -> adder.add("8734628746238476238476, 4"));
    }

    @Test
    public void whenAddIsCalledWithTwoNumbersFourAndFive(){
        StringAdder adder = new StringAdder();
        int result = adder.add("4,5");
        assertEquals(9, result);
    }

    @Test
    public void whenAddIsCalledWithTwoNegativeNumbers(){
        StringAdder adder = new StringAdder();
        int result = adder.add("    -1, -2   ");
        assertEquals(-3, result);
    }

    @Test
    public void whenAddIsCalledWithCommaAndNumber(){
        StringAdder adder = new StringAdder();
        int result = adder.add(",6");
        assertEquals(6, result);
    }

    @Test
    public void whenAddIsCalledWithACommaOnly(){
        StringAdder adder = new StringAdder();
        int result = adder.add(",");
        assertEquals(0, result);
    }

    @Test
    public void whenAddIsCalledWithAnWord() throws RuntimeException{
        StringAdder adder = new StringAdder();
        assertThrows(RuntimeException.class,  () -> adder.add("twee"));
    }

}
