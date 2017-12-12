public class TestDrive {
	
	// 프로그램의 시작점 
	public static void main(String[] args) {

		// 객체(Object), yeEun, sangil, sangHoon
		Person yeEun = new Person(10, 163, "여", 23, "강예은", "A");
		Person sangil = new Person(10, 173, "남", 45, "김상일", "B");
		Person sangHoon = new Person(10, 177, "남", 32, "정상훈", "C");	

		// yeEun이 빵을 먹는다 
		String result1 = yeEun.eat("빵");
		System.out.println(result1);

		// sangil이 침대에서 잔다
		String result2 = sangil.sleep("침대");
		System.out.println(result2);

		// sangHoon이 구름위로 걷는다
		sangHoon.walk("구름");

		// sangHoon 비트코인을 생각한다
		sangHoon.think("비트코인");
	}	

}