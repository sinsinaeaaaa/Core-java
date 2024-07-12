
public class PolymorphismDemo3 {
	public static void main(String[] args) {
//		Dog [] array = new Dog[3];
		Mammal [] array = new Mammal[4];
		array[0] = new Dog(); // Mammal 이 들어가야 되는 곳에 Mammal의 자식이 들어갈 수 있다.
		array[1] = new Cat();
		array[2] = new American();
		array[3] = new Korean();
		// 4개의 타입이 다르지만 부모가 같기 때문에 들어갈 수 있다.
		for(Mammal m : array ) m.sayThing();
	}
}
