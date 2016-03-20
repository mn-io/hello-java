package day1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcRefactoredTest {

    @Test
    public void testMain() throws Exception {
        CalcRefactored.main("0", "+", "1");
    }

    @Test
    public void testGetResultUnknownOperator() throws Exception {
        String result = CalcRefactored.getResult(0, "!", 1);
        assertEquals(result, "Operator nicht gefunden");
    }

    @Test
    public void testGetResultMinus() throws Exception {
        String result = CalcRefactored.getResult(0, "-", 1);
        assertEquals(result, "-1");
    }

    @Test
    public void testGetResultPlus() throws Exception {
        String result = CalcRefactored.getResult(0, "+", 1);
        assertEquals(result, "1");
    }

    @Test
    public void testGetResultMultiply() throws Exception {
        String result = CalcRefactored.getResult(0, "*", 1);
        assertEquals(result, "0");
    }

    @Test
    public void testGetResultDivide() throws Exception {
        String result = CalcRefactored.getResult(0, "/", 1);
        assertEquals(result, "0");

        result = CalcRefactored.getResult(1, "/", 0);
        assertEquals(result, "Division durch 0 nicht erlaubt");
    }

    @Test
    public void testGetResultModulo() throws Exception {
        String result = CalcRefactored.getResult(5, "%", 3);
        assertEquals(result, "2");

        result = CalcRefactored.getResult(1, "%", 0);
        assertEquals(result, "Division durch 0 nicht erlaubt");
    }
}