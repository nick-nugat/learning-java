package concepts;

import java.util.HashMap;
import java.util.Map;

public class Maps {
	public static void main(String[] args) {
		Map<String, Integer> empIds = new HashMap<>();

		empIds.put("Nick", 15243);
		empIds.put("John", 333);
		empIds.put("Carl", 6969);

		System.out.println(empIds);
	}

}
