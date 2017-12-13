class Student{
	// 인스턴스 변수(Instance Variable), 멤버 변수(Member Variable)
	int studentID;
	String name;
	int age;
	String major;
	int grade;

	// 생성자(Constructor)
	public Student(int studentID, String name, int age, String major, int grade){
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		this.major = major;
		this.grade = grade;
	}
	
	// 괄호안에 들어가는 것들을 parameter(Argument)라고 한다.
	// 메서드(method)
	void Study(){
		System.out.println(this.name + " (이)가 " + this.major + " 공부를 한다.");
	}
	
	void Introduce(){
		System.out.println("저는 " + this.major + this.grade + "학년 재학중인 " 
							+ this.name + " 입니다.");
	}
}	