import java.util.Date;

public class DeprecationDemo {
	public static void main(String[] args) {
		Date today = new Date();
		//System.out.println(today); // today.toString() Tue Jul 16 12:41:41 KST 2024
		int year = today.getYear(); // error 가 아님
		System.out.println(year);
	}
}
