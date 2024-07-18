
public class LambdaDemo3 {
	public static void main(String[] args) {
		Person1 jimin = new Person1();
		// 1. Polymorphic parameter를 이용하자.
//		jimin.greeting(new Say1() {
//			@Override 
//			public int something() {
//				System.out.println("I'm jimin.");
//				System.out.println("Nice to meet you.");
//				return 100;
//			}
//		});
		
		//2. Lambda Expression을 이용하자.
		jimin.greeting(()->{
				System.out.println("I'm jimin.");
				System.out.println("Nice to meet you.");
				return 200;
			});
	}
}
@FunctionalInterface
interface Say1{
	int something();
}
class Person1{
	public void greeting(Say1 say) {
		int value = say.something();
		System.out.println("value = " + value);
	}
}