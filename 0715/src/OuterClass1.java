// member inner class

public class OuterClass1 {
	public static void main(String[] args) {
		OuterClass1.InnerClass1 ic = new OuterClass1.InnerClass1();
		ic.display();
		ic.print();
	}
	
	private int a = 5; // OuterClass의 멤버 변수
	private static int b = 10; // OuterClass 의 static 변수
	
	private static class InnerClass1 {
		private int c = 100; // static InerClass 의 멤버 변수
		private static int d = 500; // static InnerClass 의 static 변수
		public void display() { //static InnerClass의 멤버 메소드
			System.out.println(b); // b,c,d 접근 된다  a는 안된다.바깥쪽 멤버이기 때문에.
		}
		public static void print() {
			System.out.println(b); // b,d 접근 된다 a,c 는 안된다. static에서 멤버로는 접근이 안된다.
		}
		
	}
}
