/*
 * 다형성
 * 1. 객체 형변환
 * 1) 자동 형변황, implicit conversion, promotion
 * - 자식 객체가 부모 객체가 형변활 할 때
 * 2) 강제 형변환, explicit conversion, demotion
 * - 부모 객체가 자식 객체로 형변활 하고자 할 때, 단 instanceof 연산자가 true를 리턴할 때만 가능.
 * 2. Override method
 */
public class PolymorphismDemo {
	public static void main(String[] args) {
		int su = 5;
		long lo = su;//자동 형변환, 암묵적 형변환, promotion
		double avg = su;// 자동 형변환
		short sh = (short)avg;//강제 형변환, 명시적 형변환, demotion
		
		Test t = new Test();
		Demo d = new Demo();
//		t=d; // 객체 끼리는 형변환이 되지 않는다.
		
		Demo2 d2 = new Demo2();
//		t=d2; // d2 자식이 암묵적으로 부모 형태로 바뀐 후에 t 에 들어간다. 가능함.
		if (t instanceof Demo2) {
			d2 = (Demo2) t;
		} else {
			System.out.println("안돼");
		}
		
		
		
		
	}
}
class Test{}
class Demo{}
class Demo2 extends Test {}
