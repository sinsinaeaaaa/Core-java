
public class ConstructorDemo1 {
	public static void main(String [] args) {
		MyDate birthday = new MyDate();
		System.out.println(birthday.year);
	}
}
class MyDate{
	int year, month, day;
	public MyDate() { //dafault constructor's overriding
		this.year = 2024; this.month=7; this.day = 10;
	}
}