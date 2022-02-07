package homeWork_STED6;

public class Day10HM002 {
	public static void main(String[] args) {

		getGender('m');

	}

	public static void getGender(char gender) {
		if (gender == 'm' || gender == 'M') {
			System.out.println("Male");

		} else if (gender == 'F' || gender == 'f') {
			System.out.println("Female");

		} else {
			System.out.println("error");
		}
	}
}
