// 동일 클래스 내에 있더라도 static 변수가 아니면 class 명을 붙여줘야 한다.

public class HelloWorld2 {
	String str = "Hello, World"; //member, instance variable
	public static void main(String[] args) {
		HelloWorld2 hw = new HelloWorld2();
		System.out.println(hw.str);
	}

}
