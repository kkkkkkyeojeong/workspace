class Person {
	
	// 인스턴스 변수, 멤버 변수	
	int ssn;	// 주민번호
	String name;	// 이름
	int age;	// 나이
	String address;	// 주소

	// 생성자(constroctor)
	public Person(int ssn, String name, int age, String address) {
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	// 주민번호 기준으로 두 사람이 같은지 비교 
	boolean equals(Person person) {
		if (this.ssn == person.ssn) {
			return true;
		}
			return false;
	}

	

}