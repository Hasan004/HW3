package lab5test;

import org.junit.Test;
import org.lab5.Great;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void greatestTest1() {
        //Given
        Great p = new Great();

        //when
        int resultaat1 = p.greatest(5, 6);

        //then
        assertEquals(6, resultaat1);
    }

    @Test
    public void greatestTest2() {
        //Given
        Great p = new Great();

        //when
        String resultaat2 = p.greatest("h", "hoooooii");

        //then
        assertEquals("hoooooii", resultaat2);
    }

    @Test
    public void greatestTest3() {
        //Given
        Great p = new Great();

        //when
        int resultaat3 = p.greatest(5, 30, 40, 10000);

        //then
        assertEquals(10000, resultaat3);
    }

    @Test
    public void greatestTest4() {
        //Given
        Great p = new Great();

        //when
        int resultaat4 = p.factorial(5);

        //then
        assertEquals(120, resultaat4);
    }
}