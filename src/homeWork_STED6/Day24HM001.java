package homeWork_STED6;


public class Day24HM001 {

	
	public static void main(String[] args) {

		Day24HM001 obj = new Day24HM001();

		int n1[] = { 6, 1, 2, 3 };
		int n2[] = { 13, 3 };
		int n3[] = { 0, 1, 4 };
		int n4[] = { 6 };

		int result1[] = obj.getDouble(n1);
		int result2[] = obj.getDouble(n2);
		int result3[] = obj.getDouble(n2);
		int result4[] = obj.getDouble(n2);

		for (int i = 0; i < result1.length; i++) {
			System.out.println(result1[i]);
			
		}
		for (int i = 0; i < result2.length; i++) {

			System.out.println(result2[i]);
		}
		for (int i = 0; i < result3.length; i++) {

			System.out.println(result3[i]);
		}

		for (int i = 0; i < result4.length; i++) {

			System.out.println(result4[i]);
		}
	}

	private int[] getDouble(int[] number) {

		int[] result = new int[number.length * 2];

		int lastIndex = result.length - 1;
		int lastEelement = number[number.length - 1];

		result[lastIndex] = lastEelement;

		return result;
	}

}
