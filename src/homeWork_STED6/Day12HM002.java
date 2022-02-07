package homeWork_STED6;

public class Day12HM002 {
	
	public static void main(String[] args) {

		boolean multipleOfThree = multiple(3);
		System.out.println(multipleOfThree);

		boolean multipleOfTen = multiple(10);
		System.out.println(multipleOfTen);

		boolean multipleOfEight = multiple(8);
		System.out.println(multipleOfEight);
	}

	public static boolean multiple(int num) {

		boolean result = false;

		if (num < 0 && num % 3 == 0 || num %5 ==0) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}
}
