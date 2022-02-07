package homeWork_STED6;

public class Day20HM005 {

	public static void main(String[] args) {

		Day20HM005 obj = new Day20HM005();

		String resultOne = obj.getSubStr("java training", 2, 6);
		String resultTwo = obj.getSubStr("Software Development Engineer in TEST", 11, 23);
		String resultThree = obj.getSubStr("Software Development Engineer in TEST", 21, 29);

	}

	static String getSubStr(String str, int startingIndex, int endingIndex) {

		String result = "";

		System.out.println(str.substring(startingIndex, endingIndex));

		return result;
	}
}
