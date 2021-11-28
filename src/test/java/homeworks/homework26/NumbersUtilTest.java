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
    @MethodSource("factory1")
    @DisplayName("Проверка метода поиска наибольшего общего делителя")
    void gcdWithParamsEquals(int firstValue, int secondValue, int expected) {

        final int actual = NumbersUtil.gcd(firstValue, secondValue);
        Assertions.assertEquals(actual, expected);
    }

    private static Stream <Arguments> factory1() {
        return Stream.of(
                Arguments.of(18, 12, 6),
                Arguments.of(9, 12, 3),
                Arguments.of(64, 48, 16));
    }

    @ParameterizedTest
    @MethodSource("factory2")
    @DisplayName("Проверка метода поиса наибольшего общего делителя с неверным результатом")
    void gcdWithParamsNotEquals(int firstValue, int secondValue, int expected) {

        final int actual = NumbersUtil.gcd(firstValue, secondValue);
        Assertions.assertNotEquals(actual, expected);
    }

    private static Stream <Arguments> factory2() {
        return Stream.of(
                Arguments.of(18, 12, 5),
                Arguments.of(9, 12, 2),
                Arguments.of(64, 48, 15));
    }

    @ParameterizedTest
    @MethodSource("factory3")
    @DisplayName("Проверка на выброс исключения при вводе отрицательного числа")
    void gcdException(int firstNumber, int secondNumber) {

        Assertions.assertThrows(
                ArithmeticException.class,
                () -> NumbersUtil.gcd(firstNumber, secondNumber)
        );
    }

    private static Stream <Arguments> factory3() {
        return Stream.of(
                Arguments.of(18, -12),
                Arguments.of(-9, 12),
                Arguments.of(-64, -48));
    }
}