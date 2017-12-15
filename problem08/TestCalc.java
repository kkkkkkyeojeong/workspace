public class TestCalc {

	public static void main(String[] args) {


	Calc A = new Calc();

	int ta = Integer.parseInt(args[0]);
	int tb = Integer.parseInt(args[1]);
	


	int result1 = A.add(ta, tb);
	System.out.println(result1);

	int result2 = A.sub(ta, tb);
	System.out.println(result2);

	int result3 = A.mul(ta, tb);
	System.out.println(result3);

	int result4 = A.div(ta, tb);
	System.out.println(result4);

	}

}