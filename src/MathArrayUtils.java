import java.util.Arrays;

public class MathArrayUtils {
    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) sum += num;
        return sum;
    }

    public static float average(int[] array) {
        return sum(array) / (float)array.length;
    }

    public static int min(int[] array) {
        int m = array[0];
        for (int num : array) {
            if (num < m) m = num;
        }
        return m;
    }

    public static int max(int[] array) {
        int m = array[0];
        for (int num : array) {
            if (num > m) m = num;
        }
        return m;
    }

    // 인스턴스 생성 막기!!!
    private MathArrayUtils() {};
}
