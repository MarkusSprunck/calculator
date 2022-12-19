package builder;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TreeAlgosTest {
    @Test
    public void validTest1(){
        String calculation = "( ( 2 * 3 * 5 ) + 14 ) * ( 7 - 3 )";

        String expected = "176";

        String result = TreeAlgos.run(calculation);

        assertEquals(expected, result);
    }

    @Test
    public void validTest2(){
        String calculation = "( 2 * 3 * 5 ) + 14 * ( 7 - 3 )";

        String expected = "86";

        String result = TreeAlgos.run(calculation);

        assertEquals(expected, result);
    }

    @Test
    public void validTest3(){
        String calculation = "2 * 3 * 5 + 14 * 7 - 3";

        String expected = "125";

        String result = TreeAlgos.run(calculation);

        assertEquals(expected, result);
    }

    @Test
    public void validTest4(){
        String calculation = "5 + 10";

        String expected = "15";

        String result = TreeAlgos.run(calculation);

        assertEquals(expected, result);
    }

    @Test
    public void validTest5(){
        String calculation = "( ( 5 * 6 ) )";

        String expected = "30";

        String result = TreeAlgos.run(calculation);

        assertEquals(expected, result);
    }

    @Test
    public void validTest6(){
        String calculation = "( 20 - ( 5 * 6 ) + 15 - ( 9 + 5 ) + ( 2 * 8 * ( 8 + 45 ) ) ) + 20";

        String expected = "859";

        String result = TreeAlgos.run(calculation);

        assertEquals(expected, result);
    }
}
