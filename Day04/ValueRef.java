public class ValueRef {

	public static void main(String[] args) {

		String hello01 = "Hello";
		String hello02 = "Hello";

		String hello03 = new String("Hello");
		String hello04 = new String("Hello");

			System.out.println(hello01);
			System.out.println(hello02);
			System.out.println(hello03);

		// hello01과 hello02 변수간의 비교(==)
		if (hello01 == hello02) {
			System.out.println("hello01과 hello02는 같다");
		}
		else {
			System.out.println("hello01과 hello02는 같지않다");
		}

		// hello01과 hello03 변수간의 비교(==)
		if (hello01 == hello03) {
			System.out.println("hello01과 hello03은 같다");
		}
		else {
			System.out.println("hello01과 hello03은 같지않다");
		}

		// hello03과 hello04 변수간의 비교(==)
		if (hello03 == hello04) {
			System.out.println("hello03과 hello04는 같다");
		}
		else {
			System.out.println("hello03과 hello04는 같지않다");
		}

		// hello01과 hello03 변수간의 비교(equals)
		if (hello01.equals(hello03)) {
			System.out.println("hello01과 hello03은 같다");
		}
		else {
			System.out.println("hello01과 hello03은 같지않다");
		}

		

	}
}