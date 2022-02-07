package homeWork_STED6;

public class Day12HM001 {
	public static void main(String[] args) {
		boolean posNeg = posNegNum(1, -1, false);
		System.out.println(posNeg);

		boolean posNeg1 = posNegNum(-1, 1, false);
		System.out.println(posNeg1);

		boolean posNeg2 = posNegNum(-4, -5, true);
		System.out.println(posNeg2);
	}

	public static boolean posNegNum(int num1, int num2, boolean num3) {

		boolean result = false;

		if (num1 > 0 && num2 < 0 && num3 == false) {
			result = true;
		} else if (num1 < 0 && num2 > 0 && num3 == false) {
			result = true;
		} else if (num1 < 0 && num2 < 0 && num3 == true) {
			result = true;
		}

		return result;
	}
}
