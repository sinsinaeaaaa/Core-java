
public class StaticDemo {
	public static void main(String [] args) {
		Tiger [] array = new Tiger[4];
		for (int i=0 ; i < array.length ; i++) {
			array[i] = new Tiger();
		}
		for(Tiger t : array) {
			System.out.println("a = " + t.a + " b = " + Tiger.b);
		}
//		a = 1b = 4
//		a = 1b = 4
//		a = 1b = 4
//		a = 1b = 4
		// *** static 변수는 하나를 공통으로 사용하는것이므로 1이더해질 때마다 공통으로 더해져서 4가 되지만
		// *** 멤버 변수는 for문이 돌때마다 새로운 1이 생기므로 더해지지 않는다.
	}
}
class Tiger {
	int a; // 초기값 0
	static int b; // 초기값 0
	public Tiger() {
		a++;
		b++;
	}
}