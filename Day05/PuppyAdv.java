class PuppyAdv {

	String type;
	String name;
	int age;
	String gender;

	public PuppyAdv(String type, String name, int age, String gender) {

		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
			
		// ������ �켱����
		// 0. &&: ����(�Ѵ� true -> true / �ϳ��� false -> false)   (false-0, true-1)
		// 0. ||: ����(�ϳ��� true -> true / �Ѵ� false -> false)
		// 1. + - * / 
		boolean equals(PuppyAdv puppy) {

			// �켱����: == ���� �� && ���� �� 
			if (this.type == puppy.type && this.name == puppy.name) {
				return true;
			}
				return false;
		}
}