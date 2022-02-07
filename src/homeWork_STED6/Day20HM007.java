package homeWork_STED6;

public class Day20HM007 {

	public static void main(String[] args) {

		Day20HM007 obj = new Day20HM007();

		String resultOne = obj.concatString("Java", "awesome");
		String resultTwo = obj.concatString("food", "door");
		String resultThree = obj.concatString("java", "training");
		String resultFour = obj.concatString("Pro", "ogress");
	}

	String concatString(String strOne, String strTwo) {

		String result = "";

		System.out.println(strOne.concat(strTwo));

		return result;
	}
}
