public class Array {

	public static void main(String[] args) {

		String mon = "월";
		String tus = "화";
		String wed = "수";
		String thr = "목";
		String fri = "금";
		String sat = "토";
		String sun = "일";

		System.out.print(mon);
		System.out.print(tus);
		System.out.print(wed);
		System.out.print(thr);
		System.out.print(fri);
		System.out.print(sat);
		System.out.print(sun);

		System.out.println();

		// 배열 (Array)
		// 정적 배열
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		for (int i = 0; i <weeks.length; i++) {
			System.out.print(weeks[i]);
		}
		
		System.out.println();

		// 동적 배열
		String[] fruit = new String[4];
		fruit[0] = "사과";
		fruit[1] = "딸기";
		fruit[2] = "포도";
		fruit[3] = "바나나";

		for (int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i]);
		}

		// 2차원 배열 
		// 정적 배열(배열([]) 안에 배열({}) 존재, 그안에 String 세칸 생성)
		String[][] person = {{"홍길동", "서울", "남자"}, {"홍길순", "부산", "여자"}};

				// Person[] p = new Person[3];   --> 클래스 이용하여 생성

		String result1 = person[0][0];		//홍길동
		String result2 = person[0][1];		//서울
		String result3 = person[1][2];		//여자

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

		for (int i = 0; i <person.length; i++) {
			for (int j = 0; j < person[i].length; j++) {
				System.out.println(person[i][j]);
			}
		
		}

		// 동적 배열 (과일 - 이름, 품질, 개수, 맛)
		String[][] fruitArray = new String[3][4];
		fruitArray[0][0] = "귤";
		fruitArray[0][1] = "상";
		fruitArray[0][2] = "10";
		fruitArray[0][3] = "상큼하다";

		fruitArray[1][0] = "사과";
		fruitArray[1][1] = "중";
		fruitArray[1][2] = "20";
		fruitArray[1][3] = "달콤하다";

		fruitArray[2][0] = "바나나";
		fruitArray[2][1] = "최상";
		fruitArray[2][2] = "25";
		fruitArray[2][3] = "달달하다";

		System.out.println(fruitArray[0][0]);

		System.out.println();

		// 위 2차원 동적배열 for, if문 이용하여 출력 
		// 출력 형식
		// 이름: 귤
		// 품질: 상
		// 개수: 10
		// 맛: 상큼하다 

		for (int a = 0; a <fruitArray.length; a++) {
			for (int b = 0; b < fruitArray[a].length; b++) {
				if ( b == 0 ) {
					System.out.print("이름: ");
				}
				else if ( b == 1 ) {
					System.out.print("품질: ");

				}
				else if ( b == 2 ) {
					System.out.print("개수: ");
				}
				else if ( b == 3 ) {
					System.out.print("맛: ");
				}
					System.out.println(fruitArray[a][b]);
				
			}
		
		}


	}
}