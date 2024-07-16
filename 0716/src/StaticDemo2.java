
public class StaticDemo2 {
	private int a; //member variable
	private final int B; // member constant
	private static int c; //static variable
	private static final int D; // static constant
	{ //initialization block
		a = 5; B = 100; 
	}
	static { //static  initialization block 스태틱 상수, 스태틱 변수 초기화 , class 로딩 시 단 한번 수행.
		c = 100; D = 1000;
	}
	public static void main(String[] args) {
		System.out.println(c + "," + D);
	}
	void print() {
		int e; //local variable
		final int F; //local constant
	}
}
