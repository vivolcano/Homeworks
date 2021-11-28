package homeworks.homework26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class NumbersUtilTest {

    @ParameterizedTest
    @MethodSource("factory")
    @DisplayName("Проверка метода поиса наибольшего общего делителя")
    void gcdWithParams(int firstValue, int secondValue, int expected) {

        final int actual = NumbersUtil.gcd(firstValue, secondValue);
        Assertions.assertEquals(actual, expected);
    }

    private static Stream <Arguments> factory() {
        return Stream.of(
                Arguments.of(18, 12, 6),
                Arguments.of(9, 12, 3),
                Arguments.of(64, 48, 16));
    }

    @Test
    @DisplayName("Проверка на выброс исключения при вводе отрицательного числа")
    void gcdException() {

        final int firstNumber = -27;
        final int secondNumber = 24;

        Assertions.assertThrows(
                ArithmeticException.class,
                () -> NumbersUtil.gcd(firstNumber, secondNumber)
        );
    }
}