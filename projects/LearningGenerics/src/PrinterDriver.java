public class PrinterDriver {
    public static void main(String[] args) {
        Printer<Integer> printInteger = new Printer<>(10);
        printInteger.print();
        
        Printer<String> printString = new Printer<>("Hello world!");
        printString.print();
    }
}
