/**
 * Printer
 */
public class Printer <T> {
    T printThis;

    public Printer(T printThis){
        this.printThis = printThis;
    }

    public void print(){
        System.out.println(printThis);
    }
}