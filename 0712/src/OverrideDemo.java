
public class OverrideDemo {
	public static void main(String[] args) {
		Base parent = new Derived();
		parent.display();
	}
}
class Base {
	public void display() {
		System.out.println("나는 부모 메소드");
	}
}
class Derived extends Base {
	@Override
	public void display() { // 부모의 display는 public인데 자식의 display가 default일 수 없다. 부모보다 범위가 작을 수 없다.
		System.out.println("나는 자식 메소드");
	}
}

// public > protected > (default) > private