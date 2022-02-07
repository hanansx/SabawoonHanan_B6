package homeWork_STED6;

public class Day19HM005 {

	public static void main(String[] args) {

		Day19HM005 obj = new Day19HM005();
		String resultOne = obj.combinerStr("day", "ONE", "work", "HOURS");
		String resultTwo = obj.combinerStr("week", "weekend", "monday", "Tuesday");
		String resultthree = obj.combinerStr("restoN", "vA", "baltiMORE", "MD");
		String resultfour = obj.combinerStr("java", "is", "fun", "LEARNING");

	}

	protected String combinerStr(String strOne, String strTwo, String strThree, String strFour) {

		String result = "";

		String result1 = strOne.toUpperCase();
		String result2 = strTwo.toLowerCase();
		String result3 = strThree.toUpperCase();
		String result4 = strFour.toLowerCase();

		String finalResult = result1 + result2 + result3 + result4;
		System.out.println(finalResult);

		return result;

	}
}
