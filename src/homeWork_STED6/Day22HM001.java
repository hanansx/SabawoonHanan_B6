package homeWork_STED6;

public class Day22HM001 {
	public static void main(String[] args) {

		Day22HM001 obj = new Day22HM001();

		String resultOne = obj.toUpper("Pro");
		String resulTwo = obj.toUpper("learning");
		String resulThree = obj.toUpper(null);

	}

	String toUpper(String strOne) {

		String result = "";

		if (strOne == null) {
			System.out.println("null");
		} else {

			System.out.println(strOne.toUpperCase());

		}

		return result;

	}
}
