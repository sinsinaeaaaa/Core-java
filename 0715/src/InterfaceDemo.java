
public class InterfaceDemo {
	public static void main(String[] args) {
//		Mammal1 m = new Mammel1();
		// interface 도 추상클래스처럼 인스턴스화가 안된다.
		Mammal1 m = new Dog(); m.display();
		Mammal1 m1 = new Cat(); m1.display();
		System.out.println(Mammal1.PI);
//		Mammal.PI = 3.15 ; // 상수이기 때문에 값을 바꿀 수 없다.
		
		// for문으로 출력하기.
		Mammal1 [] array = new Mammal1[2];
		array[0] = new Dog();
		array[1] = new Cat();
		for (Mammal1 m3 : array) m3.display();
	}
}

// 3. interface를 구현 시 implements 키워드 사용해야 한다.
class Dog implements Mammal1{
	// 4. interface 추상메소드를 재정의시 반드시 public 이어야 한다.
	@Override
	public void display() { // public을 붙여야 한다. 부모가(Mammal1의 display)가 public 이기 때문에. 부모의 public은  생략된 것.
		System.out.println("개에 맞게 재정의된 메소드");
	}
}
class Cat implements Mammal1{
	@Override
	public void display() { // public을 붙여야 한다. 부모가(Mammal1의 display)가 public 이기 때문에. 부모의 public은  생략된 것.
		System.out.println("고양이에 맞게 재정의된 메소드");
	}
}


/*
 * interface
 * 1. public static final이 생략된 상수만 가질 수 있다. 
 * 2. public abstract 이 생략된 추상 메소드만 가질 수 있다.
 */

interface Mammal1 {
	// 1. public static final이 생략된 상수만 가질 수 있다.
	double PI = 3.14;
	int sat = 0;
//	private String name; //private 사용할 수 없다. 변수는 쓸 수 없다.
//	private int age;
	
//	public Mammal(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	@Override
//	public String toString() {
//		return String.format("Mammal [name=%s, age=%s]", name, age);
//	}
//	
	// 2. public abstract 이 생략된 추상 메소드만 가질 수 있다.
	void display(); 
}