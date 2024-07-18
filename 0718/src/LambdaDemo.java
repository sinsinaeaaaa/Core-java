/*
 * Lambda & Steam API
 * 1. Lambda Expression
 * 	1) 원래 객체지향 언어에서 사용하지 않고, Scala나 Groovy 같은 함수형 언어에서 사용하던 문법
 * 	2) 메소드는 클래스 안에서 객체의 행위를 정의하지만, Expression이라고 한 이유는
 * 	   Method의 역할과 동일하지만 특정 클래스 소속이 아니기 때문이다.
 * 	3) Lambda Expression 을 사용하면서 매개변수와 리턴 타입만으로 간단히 코드를 작성할 수 있기 때문에,
 *     병렬 프로그래밍을 하지 않아도 되어 Collection Framework에서 효과적인 코드를 작성할 수 있다.
 *  4) 순서
 *     - 객체의 생성부분을 삭제한다.
 *     - Override annotation 을 삭제한다.
 *     - 접근지정자, 리턴타입, 메소드 이름을 삭제한다.
 *     - 파라미터타입을 삭제한다.
 *       --굳이 파라미터 타입을 정의하지 않아도 추론이 가능하다면, 파라미터 타입을 삭제가능하고, 불가능하면 파라미터 타입을 명시하는데, 모두 명시해야 한다.
 *     - 메소드의 바디의 리턴을 삭제한다.
 *     - 메소드 () 뒤에 {} 을 삭제한다.
 *       --메소드의 구현부의 문장이 한 개일 경우에만 해당.
 *     - 메소드의 파라미터 선언부 괄호 뒤와 {} 사이였던 부분을 -> 연산자로 연결한다.
 */

public class LambdaDemo {
	public static void main(String[] args) {
		int c =5 ; int d=10;
//		MyInterface mi = new MyInterface() {
//			@Override 
//			public int add(int a, int b) {
//				return a+b;
//			}
//		};
		
		// Lambda expresion
		MyInterface mi = (a,b) -> a+b;
		int result = mi.add(c, d);
		System.out.println("result = " + result);
	}
	
}
@FunctionalInterface
interface MyInterface {
	int add(int a, int b);
}