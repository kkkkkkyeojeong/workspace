public class TestPuppy {

	public static void main(String[] args) {

		Puppy mimi = new Puppy("푸들", "미미", 6, "여자");
		Puppy maru = new Puppy("말티즈", "마루", 11, "여자");
		Puppy momo = new Puppy("푸들", "미미", 7, "남자");

	boolean isEquals = mimi.equals(maru);
	System.out.println(isEquals);
	}
}