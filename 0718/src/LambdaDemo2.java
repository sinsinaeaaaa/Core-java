
public class LambdaDemo2 {
	public static void main(String[] args) {
		Person jimin = new Person();
		// 1. Polymorphic parameter를 이용하자.
//		jimin.greeting(new Say() {
//			@Override 
//			public void something() {
//				System.out.println("I'm jimin.");
//				System.out.println("Nice to meet you.");
//			}
//		});
		
		//2. Lambda Expression을 이용하자.
		jimin.greeting(() -> {
			System.out.println("I'm jimin.");
			System.out.println("Nice to meet you.");
		});
	}
}
@FunctionalInterface
interface Say{
	void something();
}
class Person{
	public void greeting(Say say) {
		say.something();
	}
}