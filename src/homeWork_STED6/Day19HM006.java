package homeWork_STED6;

public class Day19HM006 {

	public static void main(String[] args) {

		Day19HM006 obj = new Day19HM006();

		String resultOne = obj.helloTo("Denis");
		String resultTwo = obj.helloTo("Malek");
		String resultThree = obj.helloTo("Sara");

	}

	public String helloTo(String strOne) {

		String result = "";

		String name = "Hello";

		System.out.println(name + " " + strOne);

		return result;
	}
}