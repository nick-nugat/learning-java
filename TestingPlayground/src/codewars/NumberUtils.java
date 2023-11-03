package codewars;

public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        String numString = Integer.toString(number);
        int power = numString.length();
        int sum = 0;

        for (int i = 0; i < power; i++) {
            String valueStr = numString.substring(i, i + 1);
            int valueInt = Integer.parseInt(valueStr);

            sum += Math.pow(valueInt, power);
        }

        if (sum == number) return true;
        return false;
    }

}