/*
 * Method 호출 방법
 * 1. Call(Pass) by Name
 * 2. Call(Pass) by Value
 * 3. Call(Pass) by Reference
 */

//public class MethodDemo2 {
//
//	public static void main(String[] args) {
//		MethodDemo2 md = new MethodDemo2();
//		int original = 100;
//		md.print(original); // call by value
//		System.out.println("target = " + original);
//	}
//	
//	void print(int target) { //target = original
//		System.out.println("target = " + target);
//		target = 50000; // 여기서 target을 변경해도 original 값을 바꿀 수 없다.
//		System.out.println("target = " + target);
//	}
//
//}

public class MethodDemo2 {

	public static void main(String[] args) {
		MethodDemo2 md = new MethodDemo2();
		Product ballpen = new Product(); ballpen.price = 100;
		System.out.println("before = " + ballpen.price);
		md.change(ballpen); //ballpen은 참조타입이므로 주소를 매개변수로 보낸것이다. = 주소복사
//		int original = 100;
//		md.print(original); // call by value
		System.out.println("after = " + ballpen.price);
	}
	
	void change(Product pencil) { // pencil = ballpen 주소복사 call by reference
		pencil.price = 50000; // 주소복사를 한 것이기 때문에 여기서 변경하면 ballpen.price값이 바뀐다.
	}

}
