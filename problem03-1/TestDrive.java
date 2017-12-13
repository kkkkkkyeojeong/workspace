public class TestDrive {
	
	// 메인메서드 
	public static void main(String[] args){
		
		Student A = new Student(2017111, "홍길동", 20, "영문학과", 1);
		Student B = new Student(2015111, "김영희", 22, "철학과", 3);
		Student C = new Student(2016111, "박철수", 21, "디자인과", 2);
	
	A.Study();
	A.Introduce();
	
	B.Study();
	B.Introduce();
	
	C.Study();
	C.Introduce();
	}
}