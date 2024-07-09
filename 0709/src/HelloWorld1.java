// 동일 클래스 내에서는 static변수는 클래스 변수르 생략할 수 있다.

public class HelloWorld1 {
	static String str = "Hello, World"; //
	public static void main(String[] args) {
		//String str = "Hello, World"; //local, stack, temporary, auto variable
		System.out.println(str);
	}

}
