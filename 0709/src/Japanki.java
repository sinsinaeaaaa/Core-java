
public class Japanki {
	public static void main(String[] args) {
		int [] cash = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1}; // initialization 
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String y_n = null;
		do {
			System.out.print("Money : ");
			int price = sc.nextInt();
			
			for (int i=0 ; i < cash.length ; i++) { // array.length 는 배열의 길이를 반환한다.
				int mok = price / cash[i];
				System.out.println(cash[i] + "원권 : " + mok);
				price = price % cash[i];
			}
			System.out.print("Again(y/n)? : "); y_n = sc.next();
			y_n = y_n.toLowerCase();
		} while(y_n.equals("y"));
		System.out.println("Program is over...");
	}
}