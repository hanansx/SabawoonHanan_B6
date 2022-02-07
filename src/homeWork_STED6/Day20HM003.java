package homeWork_STED6;

public class Day20HM003 {
	public static void main(String[] args) {

		Day20HM003 obj = new Day20HM003();

		obj.replaceStr("I cannot do it", "cannot", "can");
		obj.replaceStr("Tomorrow is my day", "Tomorrow", "Today");

	}

	static void replaceStr(String strOne, String oldStr, String newStr) {

		System.out.println(strOne.replace(oldStr, newStr));
	}
}
