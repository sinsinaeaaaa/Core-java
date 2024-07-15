// member inner class
public class OuterClass {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		System.out.println(ic.c);
		System.out.println(InnerClass.d);//static
	}
	
	private int a = 5; // OuterClass의 멤버 변수
	private static int b = 10; // OuterClass 의 static 변수
	
	class InnerClass {
		private int c = 100; //InerClass 의 멤버 변수
		private static int d = 500; // InnerClass 의 static 변수
		public void display() { //InnerClass의 멤버 메소드
			System.out.println(a + ", " + b + ", " + c + ", " + d);
		}
		public static void print() {
			System.out.println(b); // InnerClass의 static 메소드
		}
		
	}
}
