public class TestPuppy {

	public static void main(String[] args) {

		PuppyAdv mimi = new PuppyAdv("Ǫ��", "�̹�", 6, "����");
		PuppyAdv maru = new PuppyAdv("��Ƽ��", "����", 11, "����");
		PuppyAdv momo = new PuppyAdv("Ǫ��", "�̹�", 7, "����");

	boolean isEqual = mimi.equals(maru);
	
		if (isEqual) {
			System.out.println("���� �������̴�.");
		}
		else {
			System.out.println("�ٸ� �������̴�.");
		}
	}
}