class Person {
	
	// �ν��Ͻ� ����, ��� ����	
	int ssn;	// �ֹι�ȣ
	String name;	// �̸�
	int age;	// ����
	String address;	// �ּ�

	// ������(constroctor)
	public Person(int ssn, String name, int age, String address) {
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	// �ֹι�ȣ �������� �� ����� ������ �� 
	boolean equals(Person person) {
		if (this.ssn == person.ssn) {
			return true;
		}
			return false;
	}

	

}