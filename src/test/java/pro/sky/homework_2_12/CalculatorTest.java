package pro.sky.homework_2_12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.homework_2_12.exceptions.ZeroDivideIllegalArgumentException;
import pro.sky.homework_2_12.service.CalcServiceImpl;

public class CalculatorTest {
    private final Integer ILLEGAL_ARGUMENT = 0;
    private final Integer NUM_1 = 3;
    private final Integer NUM_2 = 4;

    private final CalcServiceImpl calcServiceImpl = new CalcServiceImpl();

    @Test
    public void equalsPlusNumbs() {
        Integer expected = calcServiceImpl.plusResults(NUM_1, NUM_2);
        Integer actual = NUM_1 + NUM_2;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void equalsMinusNumbs() {
        Integer expected = calcServiceImpl.minusResults(NUM_1, NUM_2);
        Integer actual = NUM_1 - NUM_2;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void equalsMultiplyNumbs() {
        Integer expected = calcServiceImpl.multiplyResults(NUM_1, NUM_2);
        Integer actual = NUM_1 * NUM_2;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void equalsDivideNumbs() {
        Integer expected = calcServiceImpl.divideResults(NUM_1, NUM_2);
        Integer actual = NUM_1 / NUM_2;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void exceptionDivideOnNull() {
        Assertions.assertThrows(ZeroDivideIllegalArgumentException.class,
                () -> calcServiceImpl.divideResults(NUM_1, ILLEGAL_ARGUMENT));
    }
}
