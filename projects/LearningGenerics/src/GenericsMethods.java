public class GenericsMethods {
    public static void main(String[] args) {
        testMethod("hello");
    }

    public static <T> void testMethod(T randomType){
        System.out.println(randomType + "!!!!!!");
    }


}
