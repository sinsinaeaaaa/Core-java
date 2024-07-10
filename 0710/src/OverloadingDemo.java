
public class OverloadingDemo {
	public static void main(String[] args) {
		
	}
	void change() {}
	void change(int a) {}
	void change(int a, int b) {} // 개수가 다름
	void change(short a) {} // 타입이 다름
	void change(short a, int b) {}
	void change(int a, short b) {} // 위에와 순서가 다름.
	void change(double a) {}
}
