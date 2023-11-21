package scratch;

class Scratchpad{
	public static void main(String[] args) {
		String addressedToAndFrom =
		"""
		From: Professor Monshi
		To: Nicholas
		""";


		System.out.println(addressedToAndFrom.replace("To", "From").replaceFirst("From", "To"));


	}
}