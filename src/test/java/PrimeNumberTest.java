import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeNumberTest {
    @Test
    public void myAwesomeTest() {
        // TODO: add your test
        // 1. inputs
        int input = 2;

        //2. expected output
        boolean expect = true;

        // 3. actual output
        boolean actual = IsAPrimeNumber.isAPrimeNumber(input);


        // 4. is expected the same as actual
        assertEquals(expect, actual);

    }
}
