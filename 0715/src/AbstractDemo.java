
public class AbstractDemo extends Normal {
	
	// 생성자
	public AbstractDemo(String name) {
		super(name);
	} // 자식 생성자를 통해 부모에게 name 을 넘긴다.
	public static void main(String[] args) {
//		Normal normal = new Normal("한지민");
		Normal normal = new AbstractDemo("한지민");
		System.out.println(normal);
	}
}
abstract class Normal {
	private String name;

	public Normal(String name) {
		this.name =name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Normal [name=%s]", name);
	}
}
