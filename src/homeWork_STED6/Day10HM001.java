package homeWork_STED6;

public class Day10HM001 {

	public static void main(String[] args) {

		calculate(2.0, 4.0, '-');
		calculate(2.0, 4.0, '+');
		calculate(2.0, 4.0, '*');
		calculate(2.0, 4.0, '/');
		calculate(2.0, 4.0, '%');
	}

	public static void calculate(double numOne, double numTwo, char mathOperationSign) {
		if (mathOperationSign == '-') {
			System.out.println(numOne - numTwo);
		} else if (mathOperationSign == '+') {
			System.out.println(numOne + numTwo);
		} else if (mathOperationSign == '*') {
			System.out.println(numOne * numTwo);
		} else if (mathOperationSign == '/') {
			System.out.println(numOne / numTwo);
		} else if (mathOperationSign == '%') {
			System.out.println(numOne % numTwo);
		} else {
			System.out.println("error");
		}
	}
}
