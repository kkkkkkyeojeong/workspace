public class TestDrive{
	public static void main(String[] args){
		
			Board A = new Board(Integer.parseInt(args[0]), args[1], args[2], args[3], args[4]);
			
			String result = A.printBoard();
		    System.out.println(result);
	}
}