public class Movie {

	public static void main(String[] args) {

		int[][] seats = {{0, 0, 0, 0}, 
			          {0, 1, 0, 0},
			          {0, 0, 1, 0},
			          {0, 0, 1, 1}};

		
		// 1.args���� ���� �޾ƿ´�.

		String x = args[0];
		String y = args[1];
		System.out.println(x + ", " + y);
		
		// 2. x, y�� ����(int)�� ����
		int posX = Integer.parseInt(x);
		int posY = Integer.parseInt(y);

		// 3. seats �迭�� �����ؼ� ���� �����´�.
		int result = seats[posX][posY];

		//4. if ����Ͽ� 0�̸� ���డ��, 1�̸� ����Ұ� ���
		if (result == 0) {
			System.out.println("���డ��");
		}
		else if (result == 1) {
			System.out.println("����Ұ�");
		}
	}
}

