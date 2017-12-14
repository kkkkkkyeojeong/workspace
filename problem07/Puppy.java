class Puppy {

	String type;
	String name;
	int age;
	String gender;

	public Puppy(String type, String name, int age, String gender) {

		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

		boolean equals(Puppy puppy) {
			if (this.type == puppy.type) {
				if (this.name == puppy.name) {
					return true;
				}
					
				return false;
					
			}
				return false;
		}
	
	
}