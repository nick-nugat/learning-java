package scratch;

public class Area {
    //circle
    public static double getArea(double radius) { return Math.PI * Math.pow(radius, 2); }

    //rectangle
    public static double getArea(double l, double w) { return l * w; }

    //trapezoid
    public static double getArea(double b1, double b2, double height) { return (b1 + b2) * height / 2; }

    public static void main(String[] args) {
        double circle = getArea(3);
        double rectangle = getArea(2, 4);
        double trapezoid = getArea(3, 4, 5);

        System.out.printf("%.2f", circle);
        System.out.println();
        System.out.printf("%.1f", rectangle);
        System.out.println();
        System.out.printf("%.1f", trapezoid);
        System.out.println();
    }
}
