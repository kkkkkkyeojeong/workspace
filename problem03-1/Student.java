class Student{
	int studentID;
	String name;
	int age;
	String major;
	int grade;

	public Student(int studentID, String name, int age, String major, int grade){
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		this.major = major;
		this.grade = grade;
	}
	
	void Study(){
		System.out.println(this.name + " (이)가 " + this.major + " 공부를 한다.");
	}
	
	void Introduce(){
		System.out.println("저는 " + this.major + this.grade + "학년 재학중인 " 
							+ this.name + " 입니다.");
	}
}	