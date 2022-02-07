package homeWork_STED6;

public class Day20HM004 {

	public static void main(String[] args) {

		Day20HM004 obj = new Day20HM004();

		boolean resultOne = obj.isStartWith("java training", "ing");
		boolean resultTwo = obj.isStartWith("java training", "ja");
		boolean resultThree = obj.isStartWith("java training", "java");
		boolean resultFour = obj.isStartWith("java training", "train");

	}

	boolean isStartWith(String strOne, String strTwo) {

		boolean result = false;

		System.out.println(strOne.startsWith(strTwo));

		return result;
	}
}
