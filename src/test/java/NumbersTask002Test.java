import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

class NumbersTask002Test {
    @Test
    public void numberOfDigitsInNumber() {
        Map<Integer, Integer> test = new HashMap<>();
        test.put(12, 2);
        test.put(12343, 5);
        test.put(2 * (int) Math.pow(10, 9), 10);
        test.put(0, 1);

        test.forEach((input, output) -> {
            Assertions.assertEquals(output, NumbersTask002.numberOfDigitsInNumber(input));
        });
    }
}