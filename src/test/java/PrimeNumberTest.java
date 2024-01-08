import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeNumberTest {
    @Test
    public void myAwesomeTest() {
        // TODO: add your test
        // 1. inputs
        int[] input = {2, 3, 4, 5, 6};

        //2. expected output
        boolean[] expect = {true, true, false, true, false};

        // 3. actual output
        for (int i = 0; i < input.length; i++) {
            boolean actual = IsAPrimeNumber.isAPrimeNumber(input[i]);
            // 4. is expected the same as actual
            assertEquals(expect[i], actual);
        }

    }
}
