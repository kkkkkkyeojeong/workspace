public class TestDrive{
	public static void main(String[] args){
		
			Board A = new Board(1, "등업부탁드립니다.", "안녕하세요.", "홍길동", 
								"2017-12-13");
			Board B = new Board(2, "저도 등업 부탁드려요.", "반갑습니다.", "박지성",
								"2017-12-11");
			Board C = new Board(3, "정회원 부탁드립니다.", "내용없음", "차범근",
								"2017-12-10");
								
	String result1 = A.printBoard();
		System.out.println(result1);
		
	String result2 = B.printBoard();
		System.out.println(result2);
		
	String result3 = C.printBoard();
		System.out.println(result3);
	}
}