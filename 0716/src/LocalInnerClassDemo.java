
public class LocalInnerClassDemo {
	public static void main(String[] args) {
//		InnerClass ic = new InnerClass(); // 접근 안됨
		OuterClass out = new OuterClass();
		out.display();
	}
}
class OuterClass {
	private int a = 5; // Outer class's memver varible
	private static int b=10; // Outer class's static variable
	public void display() {
		int c = 100; // local variable
		class InnerClass {
			public void print() {
				System.out.println(c);
				c = 1000;
			}
		}
		InnerClass ic = new InnerClass();
	}
}
