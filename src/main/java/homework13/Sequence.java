package homework13;

import java.util.ArrayList;
import java.util.List;

public class Sequence {
    public static int[] filter(int[] array, ByCondition condition) {
        List<Integer> list = new ArrayList<>();
        for (int value : array) {
            if (condition.isOk(value)) list.add(value);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
