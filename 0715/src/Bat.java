
public class Bat extends Mammal implements Birds {// java는 다중 상속이 안되므로, 하나는 interface로 한다. interface는 개수 제한이 없다.

	@Override
	public void fly() {
		System.out.println("하늘을 날다");
	}

	@Override
	public void giveBirthto() {
		System.out.println("새끼를 낳다");
	} 
	
	public static void main(String[] args) {
		Bat bat = new Bat();
		bat.fly();
		bat.giveBirthto();
	}
}
