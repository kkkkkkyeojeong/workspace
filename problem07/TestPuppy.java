public class TestPuppy {

	public static void main(String[] args) {

		Puppy mimi = new Puppy("Ǫ��", "�̹�", 6, "����");
		Puppy maru = new Puppy("��Ƽ��", "����", 11, "����");

	boolean isEquals = mimi.equals(maru);
	System.out.println(isEquals);
	}
}