public class Array {

	public static void main(String[] args) {

		String mon = "��";
		String tus = "ȭ";
		String wed = "��";
		String thr = "��";
		String fri = "��";
		String sat = "��";
		String sun = "��";

		System.out.print(mon);
		System.out.print(tus);
		System.out.print(wed);
		System.out.print(thr);
		System.out.print(fri);
		System.out.print(sat);
		System.out.print(sun);

		System.out.println();

		// �迭 (Array)
		// ���� �迭
		String[] weeks = {"��", "ȭ", "��", "��", "��", "��", "��"};
		for (int i = 0; i <weeks.length; i++) {
			System.out.print(weeks[i]);
		}
		
		System.out.println();

		// ���� �迭
		String[] fruit = new String[4];
		fruit[0] = "���";
		fruit[1] = "����";
		fruit[2] = "����";
		fruit[3] = "�ٳ���";

		for (int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i]);
		}

		// 2���� �迭 
		// ���� �迭(�迭([]) �ȿ� �迭({}) ����, �׾ȿ� String ��ĭ ����)
		String[][] person = {{"ȫ�浿", "����", "����"}, {"ȫ���", "�λ�", "����"}};

				// Person[] p = new Person[3];   --> Ŭ���� �̿��Ͽ� ����

		String result1 = person[0][0];		//ȫ�浿
		String result2 = person[0][1];		//����
		String result3 = person[1][2];		//����

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

		for (int i = 0; i <person.length; i++) {
			for (int j = 0; j < person[i].length; j++) {
				System.out.println(person[i][j]);
			}
		
		}

		// ���� �迭 (���� - �̸�, ǰ��, ����, ��)
		String[][] fruitArray = new String[3][4];
		fruitArray[0][0] = "��";
		fruitArray[0][1] = "��";
		fruitArray[0][2] = "10";
		fruitArray[0][3] = "��ŭ�ϴ�";

		fruitArray[1][0] = "���";
		fruitArray[1][1] = "��";
		fruitArray[1][2] = "20";
		fruitArray[1][3] = "�����ϴ�";

		fruitArray[2][0] = "�ٳ���";
		fruitArray[2][1] = "�ֻ�";
		fruitArray[2][2] = "25";
		fruitArray[2][3] = "�޴��ϴ�";

		System.out.println(fruitArray[0][0]);

		System.out.println();

		// �� 2���� �����迭 for, if�� �̿��Ͽ� ��� 
		// ��� ����
		// �̸�: ��
		// ǰ��: ��
		// ����: 10
		// ��: ��ŭ�ϴ� 

		for (int a = 0; a <fruitArray.length; a++) {
			for (int b = 0; b < fruitArray[a].length; b++) {
				if ( b == 0 ) {
					System.out.print("�̸�: ");
				}
				else if ( b == 1 ) {
					System.out.print("ǰ��: ");

				}
				else if ( b == 2 ) {
					System.out.print("����: ");
				}
				else if ( b == 3 ) {
					System.out.print("��: ");
				}
					System.out.println(fruitArray[a][b]);
				
			}
		
		}


	}
}