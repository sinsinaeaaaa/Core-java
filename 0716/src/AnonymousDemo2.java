
public class AnonymousDemo2 {
	public static void main(String[] args) {
		AnonymousDemo2 acd = new AnonymousDemo2();
//		Dog dog = new Dog();
//		acd.display(dog);
		acd.display(new Mammal() {
			@Override
			public void sound() {
				System.out.println("멍멍멍멍"); // Dog를 만들지 않았다. 만들지 않고 사용하는 방법. 1회성방법. 하지만 많이 사용하므로 익숙해져야 한다.
			}
		});
	}
	void display(Mammal m) {
		m.sound();
	}
}

interface Mammal {
	void sound() ; 
}
//class Dog implements Mammal{
//	@Override
//	public void sound() {
//		System.out.println("멍멍멍멍");
//	}
//}
