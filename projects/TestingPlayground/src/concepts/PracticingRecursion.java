package concepts;

public class PracticingRecursion {
	public static void main(String[] args) {
		PracticingRecursion p = new PracticingRecursion();
		p.printTriangle(10);
		System.out.println(p.sum(5));
		System.out.println(p.isPalindrome("deed"));
		System.out.println(p.makeLine(5, 'b'));
	}
	public String makeLine(int n, char c){
		if (n == 0)
			return "";
		else
			return c + makeLine(n - 1, c);
	}

	public String makeStars(int n){
		String temp = "";
		for (int i = 0; i < n; i++)
			temp += "*";

		return temp;
	}
	public void printTriangle(int n){
		if (n > 0) {
			String temp = makeStars(n);
			System.out.println(temp);
			printTriangle(n - 1);
		}
	}

	public int sum(int n){
		if (n == 0)
			return 0;
		else
			return n + sum(n - 1);
	}

	public boolean isPalindrome(String word){
		if (word.isEmpty() || word.length() == 1)
			return true;
		else if (word.charAt(0) == word.charAt(word.length() - 1) )
			return isPalindrome(word.substring(1, word.length() - 1));
		else
			return false;
	}
}
