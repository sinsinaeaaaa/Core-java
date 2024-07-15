
public class AbstractDemo1 extends Normal1 {
	public AbstractDemo1(String name) {
		super(name);
	}

	public static void main(String[] args) {
		Normal1 normal = new AbstractDemo1("김지민");
		normal.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(super.getName());
	}
}

abstract class Normal1 {
	private String name; //field

	public Normal1(String name) { //constractor
		this.name =name;
	}
	public abstract void display() ; // 추상 메소드는 자식으로 하여금 강제적으로 재정의 하기위한 방법이다.
	
	public String getName() { //getter
		return name;
	}
	public void setName(String name) { //setter
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Normal [name=%s]", name);
	}
	
	
}
