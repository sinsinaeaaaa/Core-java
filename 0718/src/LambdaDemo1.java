/*
 * @FunctionalInterface
 * 1. 일반적으로 interface는 한개 이상의 추상메소드를 가질 수 있다.
 * 2. 하지만 여러개의 추상 메소드가 있으면 Lambda Expression에 에러가 발생한다.
 * 3. 그래서 Lambda Expression에서 사용하기 위한 인터페이스를 지정하기 위한 어노테이션이다.
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		
		// 첫 번째 방법
//		int a=5; int b=10;
//		Comparable com = new Comparable() {
//			@Override
//			public int compare(int front, int back) {
//				return front-back;
//			}
//		};
//		int max = com.compare(a, b);
//		System.out.println(max);
	
		// 두 번째 방법
//		calculator(new Comparable comp) {
//			@Override
//			public int compare(int front, int back) {
//				return front-back;
//			}
//		}
		// 세 번째 방법
		calculator((front, back) -> front-back);	
	}
	
	
	private static void calculator(Comparable comp) {
		int a=5; int b=10;
		int result = comp.compare(a,b);
		System.out.println(result);
	}
}
@FunctionalInterface
interface Comparable {
	int compare(int front, int back);
}