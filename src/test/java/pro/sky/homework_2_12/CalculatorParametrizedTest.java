package pro.sky.homework_2_12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.homework_2_12.service.CalcServiceImpl;

import java.util.stream.Stream;

public class CalculatorParametrizedTest {

    private CalcServiceImpl calcServiceImpl;
    private static final Integer NUM_1 = 3;
    private static final Integer NUM_2 = 4;

    public static Stream<Arguments> provideParameters() {
        return Stream.of(Arguments.of(NUM_1, NUM_2), Arguments.of(10,2));
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void equalsPlusNumbs(Integer field1, Integer field2) {
        calcServiceImpl = new CalcServiceImpl();
        Assertions.assertEquals(calcServiceImpl.plusResults(field1, field2), field1 + field2);
    }
    @ParameterizedTest
    @MethodSource("provideParameters")
    public void equalsMinusNumbs(Integer field1, Integer field2) {
        calcServiceImpl = new CalcServiceImpl();
        Assertions.assertEquals(calcServiceImpl.minusResults(field1, field2), field1 - field2);
    }
    @ParameterizedTest
    @MethodSource("provideParameters")
    public void equalsMultiplyNumbs(Integer field1, Integer field2) {
        calcServiceImpl = new CalcServiceImpl();
        Assertions.assertEquals(calcServiceImpl.multiplyResults(field1, field2), field1 * field2);
    }
    @ParameterizedTest
    @MethodSource("provideParameters")
    public void equalsDivideNumbs(Integer field1, Integer field2) {
        calcServiceImpl = new CalcServiceImpl();
        Assertions.assertEquals(calcServiceImpl.divideResults(field1, field2), field1 / field2);
    }
}
