package homeWork_STED6;

public class Day20HM006 {

	public static void main(String[] args) {

		Day20HM006 obj = new Day20HM006();

		String resultOne = obj.removeSpace("Java Training         ");
		String resultTwo = obj.removeSpace("        I  like   to  Practice       ");
	}

	static String removeSpace(String strOne) {

		String result = "";

		System.out.println(strOne.trim());
		return result;
	}
}
