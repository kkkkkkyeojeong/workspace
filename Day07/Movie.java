public class Movie {

	public static void main(String[] args) {

		int[][] seats = {{0, 0, 0, 0}, 
			          {0, 1, 0, 0},
			          {0, 0, 1, 0},
			          {0, 0, 1, 1}};

		
		// 1.args에서 값을 받아온다.

		String x = args[0];
		String y = args[1];
		System.out.println(x + ", " + y);
		
		// 2. x, y를 숫자(int)로 변경
		int posX = Integer.parseInt(x);
		int posY = Integer.parseInt(y);

		// 3. seats 배열에 접근해서 값을 가져온다.
		int result = seats[posX][posY];

		//4. if 사용하여 0이면 예약가능, 1이면 예약불가 출력
		if (result == 0) {
			System.out.println("예약가능");
		}
		else if (result == 1) {
			System.out.println("예약불가");
		}
	}
}

