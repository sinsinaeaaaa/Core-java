
public class InterfaceDemo2 {
	public static void main(String[] args) {
		Product pencil = new Product("모나미연필");
//		Product ballpen = pencil; //주소복사
		Product ballpen = pencil.copy();
		System.out.println(ballpen.name);
		pencil.name = "컴퓨터";
		System.out.println(ballpen.name); // 값을 복사한 것이기 때문에 새로운 주소를 가진 값을 가지고, 컴퓨터로 값이 바뀌지 않는다.
		
	}
}
class Product extends Object implements Cloneable { // Cloneable : flag interface, 메소드나 필드를 가지지 않음.
	// 여기서는 Cloneable 이 clone() 메소드에 의해 복사될 수 있다는 가능함을 나타낸다. 그래서 flag 깃발.
	String name;
	
	public Product(String name) {
		this.name=name;
	}
	public Product copy() {
		Product target = null;
		try {
			Object obj = this.clone(); //Object에 있는 clone 메소드는 Cloneable 인터페이스를 구현한 클래스에서만 사용 가능하다.
			if(obj instanceof Product) target = (Product) obj;
			else System.out.println("형 변환 안됨");
		} catch (CloneNotSupportedException e) {
			System.out.println("복제 안됨");
		}
		return target;
	}
}