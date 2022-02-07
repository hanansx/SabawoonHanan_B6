package homeWork_STED6;

public class Day22HM002 {

	public static void main(String[] args) {

		Day22HM002 obj = new Day22HM002();

		boolean resultOne = obj.isEndWith("java training", "ing");
		boolean resultTwo = obj.isEndWith("java training", "ng");
		boolean resultThree = obj.isEndWith("java training", "java");
		boolean resultFour = obj.isEndWith("java training", "train");
		boolean resultFive = obj.isEndWith(null, "java");
		boolean resultSix = obj.isEndWith(null, null);
		boolean resultSeven = obj.isEndWith("aaabc", "abc");
		boolean resultEight = obj.isEndWith("abc", null);

	}

	boolean isEndWith(String strOne, String strTwo) {

		boolean result = false;

		if (strOne != null && strTwo != null) {
			System.out.println(strOne.endsWith(strTwo));
		} else {
			System.out.println(false);

		}

		return result;
	}
}
