class Car {

	String Bran;
	String color;
	String type;
	int year;


	public Car(String Bran, String color, String type, int year) {

		this.Bran = Bran;
		this.color = color;
		this.type = type;
		this.year = year;		
	}


	String start(String what) {
		return what + "�� �õ��� �ɾ���.";
	}
	
	String move(String how) {
		return how + "�� �õ��� �ɾ���.";
	}

	String open(String where) {
		return where + "������.";
	}

	int power(int number) {
		return number;
	}
	
}