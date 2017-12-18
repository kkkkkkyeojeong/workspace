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
		return what + "에 시동을 걸었다.";
	}
	
	String move(String how) {
		return how + "에 시동을 걸었다.";
	}

	String open(String where) {
		return where + "열었다.";
	}

	int power(int number) {
		return number;
	}
	
}