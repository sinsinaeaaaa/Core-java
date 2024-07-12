// 다형성

public class PolymorphismDemo2 {
	public static void main(String[] args) {
		PolymorphismDemo2 pd = new PolymorphismDemo2();
		Mammal m = null;
		for (int i = 0 ; i < 3; i ++) {
			int choice = pd.choose();
			switch(choice) {
			case 1 : m = new Dog(); break;
			case 2 : m = new Cat(); break;
			case 3 : m = new American(); break;
			case 4 : m = new Korean(); break;
			}
			m.sayThing(); // m은 Mammal이라는 부모 메소드이지만, 자식 메소드에 있는 sayThing()에 의해 출력된다. = 다형성
		}
	}
	int choose() {
		System.out.println("************MENU*************");
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println("3. American");
		System.out.println("4. Korean");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("당신은 어느 종족입니까(1~4)? : ");
		return sc.nextInt();
	}
}
