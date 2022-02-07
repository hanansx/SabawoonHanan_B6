package homeWork_STED6;

public class Day20HM002 {

	public static void main(String[] args) {

		Day20HM002 obj = new Day20HM002();

		String resultOne = obj.threeEqual("Java Pro", 'P', 'B');
		String resultTwo = obj.threeEqual("Lazy mode", 'm', 'c');
		String resultThree = obj.threeEqual("Training ", 'T', ' ');

	}

	protected String threeEqual(String str, char oldChar, char newChar) {

		String result = "";

		System.out.println(str.replace(oldChar, newChar));

		return result;
	}
}
