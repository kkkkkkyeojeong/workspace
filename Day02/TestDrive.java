public class TestDrive {
	
	// ���α׷��� ������ 
	public static void main(String[] args) {

		// ��ü(Object), yeEun, sangil, sangHoon
		Person yeEun = new Person(10, 163, "��", 23, "������", "A");
		Person sangil = new Person(10, 173, "��", 45, "�����", "B");
		Person sangHoon = new Person(10, 177, "��", 32, "������", "C");	

		// yeEun�� ���� �Դ´� 
		String result1 = yeEun.eat("��");
		System.out.println(result1);

		// sangil�� ħ�뿡�� �ܴ�
		String result2 = sangil.sleep("ħ��");
		System.out.println(result2);

		// sangHoon�� �������� �ȴ´�
		sangHoon.walk("����");

		// sangHoon ��Ʈ������ �����Ѵ�
		sangHoon.think("��Ʈ����");
	}	

}