// 로컬 클래스 
// 로컬 변수와 마찬가지로 public을 붙일 수 없다.
public class OuterClass2 {
	public static void main(String[] args) {
		OuterClass2 oc = new OuterClass2();
		oc.display();
	}
	void display() {
		int a = 5;
		
		class InnerClass2{
			int b = 100;
			static int c = 500;
		}
		
		InnerClass2 ic = new InnerClass2();
		System.out.println(ic.b);
		System.out.println(InnerClass2.c);
	}
}
