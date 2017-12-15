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
			
		// 연산자 우선순위
		// 0. &&: 논리곱(둘다 true -> true / 하나라도 false -> false)   (false-0, true-1)
		// 0. ||: 논리합(하나라도 true -> true / 둘다 false -> false)
		// 1. + - * / 
		boolean equals(PuppyAdv puppy) {

			// 우선순위: == 수행 후 && 수행 됨 
			if (this.type == puppy.type && this.name == puppy.name) {
				return true;
			}
				return false;
		}
}