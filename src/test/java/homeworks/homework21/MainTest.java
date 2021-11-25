package homeworks.homework21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Проверка сложения при помощи многопоточности")
    void main() {
        final int numbersCount = 10;
        final int threadsCount = 4;
        final int[] array = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2};

        final int expected = 15;
        final int actual = Main.getByThreadSum(numbersCount, threadsCount, array);

        Assertions.assertEquals(expected, actual);
    }
}