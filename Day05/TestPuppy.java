public class TestPuppy {

	public static void main(String[] args) {

		PuppyAdv mimi = new PuppyAdv("푸들", "미미", 6, "여자");
		PuppyAdv maru = new PuppyAdv("말티즈", "마루", 11, "여자");
		PuppyAdv momo = new PuppyAdv("푸들", "미미", 7, "남자");

	boolean isEqual = mimi.equals(maru);
	
		if (isEqual) {
			System.out.println("같은 강아지이다.");
		}
		else {
			System.out.println("다른 강아지이다.");
		}
	}
}