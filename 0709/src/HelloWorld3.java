// 다른 클래스에 있는 static 변수는 class 이름으로 접근한다.

public class HelloWorld3 {
	public static void main(String[] args) {
		System.out.println(Demo.str);
	}
}
class Demo{
	static String str = "Hello, World";
}