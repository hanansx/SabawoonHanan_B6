package homeWork_STED6;

public class Day22HM005 {

	public static void main(String[] args) {

		Day22HM005 obj = new Day22HM005();

		String resultOne = obj.removeSpace(null);
		String resultTwo = obj.removeSpace(" Java Traiing         ");
		String resultThree = obj.removeSpace("     I like to   pratice      ");

	}

	static String removeSpace(String strOne) {

		String result = "";

		if (strOne == null) {

			System.out.println("null");
		} else {

			System.out.println(strOne.trim());
		}

		return result;

	}
}
