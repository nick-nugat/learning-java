package codewars;

// Make sure your class is public
 public class FindUniqueNumber {
    public static double findUniq(double arr[]) {
        double initial = arr[0];
        double temp = arr[1];
        double outlier = 0.0;

        if (initial != temp){
            if (initial == arr[2]) outlier = temp;
            else if (temp == arr[2]) outlier = initial;
        } else {
            for (int i = 2; i < arr.length; i++) {
                if (initial != arr[i]) outlier = arr[i];
            }
        }
        return outlier;

    }
}