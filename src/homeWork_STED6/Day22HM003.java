package homeWork_STED6;



public class Day22HM003 {

	
	public static void main(String[] args) {

		Day22HM003 obj = new Day22HM003();

		String resultOne = obj.threeEqual(null, 'P', 'B');
		String resultTwo = obj.threeEqual("Java Pro", 'P', 'B');
		String resultThree = obj.threeEqual("Lazy mode", 'M', 'C');
		String resultFour = obj.threeEqual("Training", 'T', ' ');

	}

	protected String threeEqual(String str, char oldChar, char newChar) {

		String result = "";

		if (str != null) {

			System.out.println(str.replace(oldChar, newChar));
		} else {
			System.out.println("null");
			
			
		}

		return result;
	}
}

