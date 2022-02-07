package homeWork_STED6;

public class Day24HM003 {

	
	public static void main(String[] args) {

		int[] n1 = { 88, 22, 6, 1, 2, 3, 88, 22, 44, 33 };
		int[] n2 = {1,2,3,22,44,33};
		int[] n3 = {88,22,6,1,8,0};
		int[] n4 = {2,3,88,22,44};

		int resultOne = getIndexNumber(n1, 3);
		System.out.println(resultOne);

		int resultTwo = getIndexNumber(n1, 12);
		System.out.println(resultTwo);
		
		int resultThree = getIndexNumber(n1, 22);
		System.out.println(resultThree);
		
		int resultFour = getIndexNumber(n1, 44);
		System.out.println(resultFour);

	}

	public static int getIndexNumber(int[] number, int  elementValue) {

		int result = -1;

		for (int i = 0; i < number.length; i++) {

			if (number[i] == elementValue) {

				result = i;
				break;
			}
		}

		return result;
	}
}
