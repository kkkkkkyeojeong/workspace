public class TestPerson {

	public static void main(String[] args) {

		Person sanghoon = new Person(861201, "������", 32, "�󵵵�");
		Person gildong = new Person(900420, "ȫ�浿", 28, "����");

		boolean isEqual = sanghoon.equals(gildong);
		System.out.println(isEqual);

		if (isEqual) {

		}

	}
}