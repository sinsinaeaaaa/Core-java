/*
 * Child : String
 * Parent : Object
 */
public class PolymorphismDemo1 {
	public static void main(String[] args) {
//		String str = "Hello, World";
//		Object original = str; // 자식이 부모형으로 자동 형변환
//		if (original instanceof String) System.out.println("된다");
//		else System.out.println("안된다"); 
//		String target = (String) original; // 부모님이 자식으로 강제 형변환
//		 System.out.println(target);
		Child younghee = new Child() ;
		younghee.display(); // "나는 자식 메소드" 출력
		
		Parent jimin = new Parent();
		
		jimin = younghee; // 자동 형변환
		jimin.display(); // "나는 자식 메소드" 출력 . jimin은 parent 주소를 가지고 child의 자원에 접근하고 있다. = 다형성
		
		
	}
}
class Parent {
	public void display() {System.out.println("나는 부모 메소드"); }
}
class Child extends Parent {
	
	@Override
	public void display() {System.out.println("나는 자식 메소드"); }
}
