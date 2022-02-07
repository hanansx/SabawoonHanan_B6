package homeWork_STED6;

public class Day11HM001 {
	
	public static void main(String[] args) {

		boolean getResult = sleepin(false, true, false);
		System.out.println("Am i on vacation and sleeping? "  + getResult);

	}

	public static boolean sleepin(boolean isWeekday, boolean isVacation, boolean amIsleeping) {

		boolean result = false;

		if (isWeekday == false) {
			result = true;
		} else if (isVacation == true) {
			result = true;
		} else if (amIsleeping == true || isVacation == true) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}
}