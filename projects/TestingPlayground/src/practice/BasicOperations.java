package practice;

public class BasicOperations {
	public static Integer basicMath(String operation, int x, int y) {
		return operation.equals("+") ? add(x, y)
				: operation.equals("-") ? subtract(x, y)
				: operation.equals("/") ? divide(x, y)
				: multiply(x, y);
	}

	public static int add(int x, int y){
		return x + y;
	}
	public static int subtract(int x, int y){
		return x - y;
	}
	public static int divide(int x, int y){
		return x / y;
	}
	public static int multiply(int x, int y){
		return x * y;
	}
}
