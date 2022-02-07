package homeWork_STED6;

public class Day11HM003 {

	public static void main(String[] args) {

		int myTotal = sunDouble(3, 3);
		System.out.println(myTotal);
	}

	public static int sunDouble(int valueOne, int valueTwo) {

		int result = 0;

		result = valueOne * 2 + valueTwo * 2;

		return result;
	}
}
