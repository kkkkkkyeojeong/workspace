public class TestPuppy {

	public static void main(String[] args) {

		Puppy mimi = new Puppy("푸들", "미미", 6, "여자");
		Puppy maru = new Puppy("말티즈", "마루", 11, "여자");
		Puppy momo = new Puppy("푸들", "미미", 7, "남자");

	boolean isEqual = mimi.equals(maru);
	
		if (isEqual) {
			System.out.println("같은 강아지이다.");
		}
		else {
			System.out.println("다른 강아지이다.");
		}
	}
}