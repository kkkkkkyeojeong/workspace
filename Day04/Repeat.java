public class Repeat {
	public static void main(String[] args){
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello World");
		}
			
		// args 배열 내용 출력
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}