package homeWork_STED6;

public class Day10HM004 {

	public static void main(String[] args) {

		getDoWhileLoopResult(1, 15);
	}

	public static void getDoWhileLoopResult(int minNum, int maxNum) {

		do {
			System.out.println(minNum);

			minNum++;

		} while (minNum <= maxNum);

	}
}
