package homeWork_STED6;

public class Day19HM007 {

	Day19HM007 obj = new Day19HM007();

	boolean result1 = obj.isThere("java training", "ini");
	boolean result2 = obj.isThere("java training", "ava");
	boolean result3 = obj.isThere("java training", "AVA");
	boolean result4 = obj.isThere("java training", "Java");

	private boolean isThere(String strOne, String value) {

		boolean result = false;

		if (strOne.contains(value)) {
			System.out.println(true);

		} else {
			System.out.println(false);
		}

		return result;
	}
}
