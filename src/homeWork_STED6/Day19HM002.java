package homeWork_STED6;


public class Day19HM002 {
	public static void main(String[] args) {

		Day19HM002 obj1 = new Day19HM002();
		Day19HM002 obj2 = new Day19HM002();
		Day19HM002 obj3 = new Day19HM002();

		obj1.isEqualLenght("Pro", "Ali");
		obj2.isEqualLenght("java", "LearNinG");
		obj3.isEqualLenght("java training", "java");

	}

	public static void isEqualLenght(String strOne, String strTwo) {

		if (strOne.length() == strTwo.length()) {
			String fullName = strOne.concat(strTwo);
			System.out.println(fullName + fullName.length());
		} else if (strOne.length() > strTwo.length()) {
			String resultOne = strOne.toUpperCase();
			System.out.println(resultOne + resultOne.length());
		} else {
			String resultTwo = strTwo.toLowerCase();
			System.out.println(resultTwo + resultTwo.length());
		}

	}
}
