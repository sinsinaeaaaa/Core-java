// override메소드와 overshadow 변수는 상속되지 않는다.
public class InheritanceDemo {
	public static void main(String[] args) {
		Horse h =  new Horse();
		h.display(); // h가 display 메소드가 없다면 부모에게서 상속받았기 때문에 사용할 수 있다. h가 display 메소드가 있다면 상속받지 않고 자기것을 사용한다. (override)
		System.out.println(h.toString()); //Horse@28a418fc
	}
}
//class Mammal extends Object{
//	public void display() {
//		System.out.println("나는 포유류");
//	}
//}
class Horse extends Mammal {
	@Override
	public String toString() {
		return "나는 제주말 입니다.";
	}
	@Override
	public void display() {
		super.display(); // 부모의 display 메소드를 실행.
		System.out.println("나는 말이야");
	}
}