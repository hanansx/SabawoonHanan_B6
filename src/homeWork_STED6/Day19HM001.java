package homeWork_STED6;

public class Day19HM001 {
	public static void main(String[] args) {

		Day19HM001 obj = new Day19HM001();

		boolean resultOne = obj.isEqual("sdet", "SDET");
		boolean resultTwo = obj.isEqual("testing", "testing");
		boolean resultThree = obj.isEqual("java", "java");
		boolean resultFour = obj.isEqual("java", "java Progamming");

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);

	}

	protected static boolean isEqual(String strOne, String strTwo) {

		boolean result = false;

		if (strOne.equals(strTwo)) {
			result = true;
		} else {
			result = false;

		}

		return result;
	}
}
