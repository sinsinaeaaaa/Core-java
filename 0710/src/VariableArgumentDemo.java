
public class VariableArgumentDemo {
	public static void main(String[] args) {
		VariableArgumentDemo vad = new VariableArgumentDemo();
		int a=1, b=2, c=3;
		char d = 'D';
		String name = "한지민";
		
		vad.change(a,b,c,d,name); // argument, 인자(인수) . 여러 타입으로도 보낼 수 있다.
	}
	
	// variable arument를 받는 방법은 ... 을 써주는 것. 배열로 받게 된다. 배열처럼 처리 가능.
	void change(Object ... A) { // parameter, 매개변수. 여러 타입을 받을 때 Object 타입을 써준다.
		System.out.println(A.length);
		for (Object su : A) {
			System.out.print(su);
		}
	}
}
