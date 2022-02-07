package homeWork_STED6;

public class Day24HM002 {

	public static void main(String[] args) {

		int n1[] = { 6, 1, 2, 3 };
		int n2[] = { 13, 3, 5, 5 };
		int n3[] = { 3, 3, 0, 1, 4, 3, 6 };
		int n4[] = { 2, 6, 2 };

		boolean resultOne = checkNum(n1);
		boolean resultTwo = checkNum(n2);
		boolean resultThree = checkNum(n3);
		boolean resultFour = checkNum(n4);

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);

	}

	protected static boolean checkNum(int[] number) {

		boolean result = false;

		int fiveCount = 0;
		int twoCount = 0;

		for (int i = 0; i < number.length; i++) {

			if (number[i] == 2) {

				twoCount++;
			} else if (number[i] == 5) {

				fiveCount++;
			}
		}

		if (twoCount == 2 || fiveCount == 2) {
			result = true;
		}
		return result;

	}
}
