import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

class SimpleTask001Test {
    @Test
    public void splitNumbersWithASpace() {
        Map<Integer, String> test = new HashMap<>();
        test.put(23, "2 3");
        test.put(19, "1 9");

        test.forEach((input, output) -> {
            Assertions.assertEquals(output, SimpleTask001.splitNumbersWithASpace(input));
        });
    }
}