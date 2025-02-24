package static2.ex;

public class MathArrayUtils {
    private static int sum;

    private MathArrayUtils() {
        //private 을 이용한 생성자를 사용하여 인스턴스 생성을 막는다.
    }

    public static int sum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static double average(int[] array) {
        return (double) sum/ array.length;
    }
    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

}
