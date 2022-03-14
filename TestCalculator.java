import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.Test;

public class TestCalculator {

    int a = 6;
    int b = 3;
    int c = -4;
    int d = 0;
    Calculator calculator = new Calculator();

    @Test
    public void testAddition(){

        // test 1: 6 + 3 = 9
        int result_1 = calculator.addition(a, b);
        assertEquals(9, result_1);

        // test 2: 3 + -4 = -1
        int result_2 = calculator.addition(b, c);
        assertEquals(-1, result_2);
    }

    @Test
    public void testSubstraction(){

        // test 1: 6 - 3 = 3
        int result_1 = calculator.substraction(a, b);
        assertEquals(3, result_1);

        // test 2: 3 - -4 = -1
        int result_2 = calculator.substraction(b, c);
        assertEquals(7, result_2);
    }

    @Test(expected = Exception.class)
    public void testDivision() throws Exception{

        // test 1: 6 / 3 = 2
        int result_1 = calculator.division(a, b);
        assertEquals(2, result_1);

        // test 2: 3 / 0 = Exeption
        int result_2 = calculator.division(b, d);
        assertNull(result_2);
    }
}
