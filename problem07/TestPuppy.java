public class TestPuppy {

	public static void main(String[] args) {

		Puppy mimi = new Puppy("Ǫ��", "�̹�", 6, "����");
		Puppy maru = new Puppy("��Ƽ��", "����", 11, "����");
		Puppy momo = new Puppy("Ǫ��", "�̹�", 7, "����");

	boolean isEqual = mimi.equals(maru);
	
		if (isEqual) {
			System.out.println("���� �������̴�.");
		}
		else {
			System.out.println("�ٸ� �������̴�.");
		}
	}
}