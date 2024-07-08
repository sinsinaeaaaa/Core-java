
public class VariableDemo {
	public static void main(String[] args) {
//		String name; //Variable Declration
//		name = "한지민" ; // Assignment
//		String email="sss@ssss" ; //Initialization
//		int su = 5;
		
//		System.out.printf("숫자 500 = %d\n", 500);
//		System.out.printf("숫자 500 = %o\n", 500);
//		System.out.printf("숫자 500 = %x\n", 500);
		
		byte a = 5;
		byte b = 7;
		//byte sum  = a + b; // 에러 발생. 연산 + 할때는 무조건 int 형식이다
		byte sum  = (byte) (a + b); // int를 byte로 형변환. 강제타입변환, 큰범위에서 작은범위로 변환.
		int sum2 = a + b;
		long sum3 = a+b; // 큰범위로 갈때 (int 에서 long) 자동 변환되므로 에러가 발생하지 않음.
		System.out.printf("sum = %d\n", sum);
		
//		System.out.print('A');
//		System.out.print('B');
//		System.out.print('\n');
//		System.out.print('C');
//		System.out.print('D');
//		System.out.print('\b');
//		System.out.print('E');
		
//		System.out.println(true);
//		System.out.println(false);
//		System.out.println(4>5);
//		
//		System.out.println("Hello, World!");
		
	}
}
