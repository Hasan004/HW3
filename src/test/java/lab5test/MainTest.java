package lab5test;

import org.junit.Test;
import org.lab5.Great;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void great() {
        //Given
        Great p = new Great();

        //when
        int resultaat1 = p.greatest(5, 6);
        String resultaat2 = p.greatest("h", "hoooooii");
        int resultaat3 = p.greatest(5, 30, 40, 10000);
        int resultaat4 = p.factorial(5);

        //then
        assertEquals(6, resultaat1);
        assertEquals("hoooooii", resultaat2);
        assertEquals(10000, resultaat3);
        assertEquals(120, resultaat4);
    }
}