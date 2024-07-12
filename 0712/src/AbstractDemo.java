
public class AbstractDemo {
	public static void main(String[] args) {
		Tiger t = new Lion();
	}
}

abstract class Tiger{ // 추상클래스
	public abstract void display();
}

class Lion extends Tiger{
	public void display() {
		System.out.println("나는 자식 메소드");
	}
}
