package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdditionValid() {
        String calculation = "1 + 5";

        String result = Calculator.run(calculation);

        assertEquals("6", result);
    }

    @Test
    public void testAdditionValidSpacesEnds() {
        String calculation = " 1 + 5 ";

        String result = Calculator.run(calculation);

        assertEquals("6", result);
    }

    @Test
    public void testAdditionValidSpacesMiddle() {
        String calculation = " 1  + 5";

        String result = Calculator.run(calculation);

        assertEquals("6", result);
    }

    @Test
    public void testAdditionValidLong() {
        String calculation = " 1  + " + Integer.MAX_VALUE;

        String result = Calculator.run(calculation);

        assertEquals(String.valueOf(1L + Integer.MAX_VALUE), result);
    }

    @Test
    public void testSubtractionValid() {
        String calculation = "1 - 5";

        String result = Calculator.run(calculation);

        assertEquals("-4", result);
    }

    @Test
    public void testSubtractionValidSpacesEnd() {
        String calculation = " 1 - 5 ";

        String result = Calculator.run(calculation);

        assertEquals("-4", result);
    }

    @Test
    public void testSubtractionValidSpacesMiddle() {
        String calculation = " 1  - 5";

        String result = Calculator.run(calculation);

        assertEquals("-4", result);
    }

    @Test
    public void testMultiplicationValid() {
        String calculation = "3 * 5";

        String result = Calculator.run(calculation);

        assertEquals("15", result);
    }

    @Test
    public void testMultiplicationValidSpacesEnd() {
        String calculation = " 3 * 5 ";

        String result = Calculator.run(calculation);

        assertEquals("15", result);
    }

    @Test
    public void testMultiplicationValidSpacesMiddle() {
        String calculation = " 3  * 5";

        String result = Calculator.run(calculation);

        assertEquals("15", result);
    }

    @Test
    public void testMultiplicationValidLong() {
        String calculation = " 2  * " + Integer.MAX_VALUE;

        String result = Calculator.run(calculation);

        assertEquals(String.valueOf(2L * Integer.MAX_VALUE), result);
    }

    @Test
    public void testDivisionValid() {
        String calculation = "3 / 5";

        String result = Calculator.run(calculation);

        assertEquals("0.600", result);
    }

    @Test
    public void testDivisionValidSpacesEnd() {
        String calculation = " 3 / 5 ";

        String result = Calculator.run(calculation);

        assertEquals("0.600", result);
    }

    @Test
    public void testDivisionValidSpacesMiddle() {
        String calculation = " 3  / 5";

        String result = Calculator.run(calculation);

        assertEquals("0.600", result);
    }

    @Test
    public void testDivisionValidThreeSF() {
        String calculation = " 10  / 3";

        String result = Calculator.run(calculation);

        assertEquals("3.333", result);
    }

    @Test
    public void testDivisionValidThreeSFRounding() {
        String calculation = " 20  / 3";

        String result = Calculator.run(calculation);

        assertEquals("6.667", result);
    }

    @Test
    public void testAdditionInvalidChar() {
        String calculation = " 10  + a";

        String result = Calculator.run(calculation);

        assertEquals("INVALID_INPUT", result);
    }

    @Test
    public void testAdditionInvalidTwoChar() {
        String calculation = " c  + a";

        String result = Calculator.run(calculation);

        assertEquals("INVALID_INPUT", result);
    }

    @Test
    public void testAdditionInvalidNoSpace() {
        String calculation = " 1+3";

        String result = Calculator.run(calculation);

        assertEquals("INVALID_INPUT", result);
    }

    @Test
    public void testDivisionInvalidDivZero() {
        String calculation = "5 / 0";

        String result = Calculator.run(calculation);

        assertEquals("ERROR", result);
    }

    @Test
    public void testInvalidOperator() {
        String calculation = " 1 ++ 3";

        String result = Calculator.run(calculation);

        assertEquals("INVALID_INPUT", result);
    }

    @Test
    public void testInvalidNull() {

        String result = Calculator.run(null);

        assertEquals("INVALID_INPUT", result);
    }
}
