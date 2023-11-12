package practice;

public class Fibonacci {
	private static long[] fibonacciCache;

	public static void main(String[] args){
		int n = 6;
		fibonacciCache = new long[n + 1];

		System.out.println(fibonacci(n));
		traditionalFibonacci(n);
	}

	private static long fibonacci(int n){
		if (n <= 1) return n;
		if (fibonacciCache[n] != 0) return fibonacciCache[n];

		long nthFibonacciNumber = fibonacci(n - 1) + fibonacci(n - 2);
		fibonacciCache[n] = nthFibonacciNumber;

		return nthFibonacciNumber;
	}

	private static void traditionalFibonacci(int n) {
		n++;
		int num1 = 0, num2 = 1;
		int counter = 0;

		while (counter < n){
			System.out.print(num1 + " ");

			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			counter++;
		}
	}


}
