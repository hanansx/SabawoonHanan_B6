package homeWork_STED6;

public class Day22HM004 {

	public static void main(String[] args) {

		Day22HM004 obj = new Day22HM004();

		String resultFour = obj.getSubStr(null, 2, 6);
		String resultOne = obj.getSubStr("java training", 2, 6);
		String resultTwo = obj.getSubStr("Software Development Engineer in TEST", 11, 23);
		String resulttThree = obj.getSubStr("Software Development Engineer in TEST", 21, 29);

	}

	static String getSubStr(String str, int startingIndex, int endingIndex) {

		String result = "";

		if (str == null) {
			System.out.println("null");
		} else {
			System.out.println(str.substring(startingIndex, endingIndex));
		}

		return result;
	}
}
