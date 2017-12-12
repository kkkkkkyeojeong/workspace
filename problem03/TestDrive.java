public class TestDrive {
	public static void main(String[] args) {
		Student sanghoon = new Student(20111748, "상훈", 23, "컴퓨터과", 3);
		Student jeongmi = new Student(20121749, "정미", 22, "국어국문학과", 2);
		Student jeongeun = new Student(20101750, "정은", 24, "디자인과", 4);
	
	sanghoon.Study();
	sanghoon.Introduce();
	
	jeongmi.Study();
	jeongmi.Introduce();
	
	jeongeun.Study();
	jeongeun.Introduce();
	}
}