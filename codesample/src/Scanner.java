public class Scanner {
	public static void main(String[] args) throws java.io.IOException{
		
		java.util.Scanner sc = new java.util.Scanner(new java.io.File("sungjuk.dat"));
		String line = sc.nextLine();
		String [] array = line.split("\\s+"); // Parsing

	}
}