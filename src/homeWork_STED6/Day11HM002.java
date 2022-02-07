package homeWork_STED6;

public class Day11HM002 {
	public static void main(String[] args) {

		boolean getResult = monkeyTrouble(true, true, true);
		System.out.println("Are we in Trouble?  " + getResult);

	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile, boolean areWeInTrouble) {

		boolean result = false;
		if (aSmile == true || bSmile == true || areWeInTrouble == true) {
			result = true;
		} else if (aSmile == true || bSmile == false || areWeInTrouble == false) {
			result = false;
		}

		return result;

	}
}
