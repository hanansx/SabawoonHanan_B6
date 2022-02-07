package homeWork_STED6;

public class Day22HM006 {

	public static void main(String[] args) {

		Day22HM006 obj = new Day22HM006();

		boolean resultOne = obj.endsWithNG(null);
		boolean resultTwo = obj.endsWithNG("I like to pratice");
		boolean resultThree = obj.endsWithNG("Everone is praticing");
		boolean resultFour = obj.endsWithNG("I am studying");

	}

	boolean endsWithNG(String strOne) {

		boolean result = false;

		if (strOne == null) {
			System.out.println(false);
		} else {
			System.out.println(strOne.endsWith("ng"));
		}
		return result;
}
}