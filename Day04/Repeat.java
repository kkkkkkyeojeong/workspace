public class Repeat {
	public static void main(String[] args){
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello World");
		}
			
		// args �迭 ���� ���
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}