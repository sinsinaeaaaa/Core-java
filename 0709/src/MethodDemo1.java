/*
 * Method 호출 방법
 * 1. Call(Pass) by Name
 * 2. Call(Pass) by Value
 * 3. Call(Pass) by Reference
 */

public class MethodDemo1 {

	public static void main(String[] args) {
		MethodDemo1 md = new MethodDemo1(); 
		md.calcHap(10,100);
		md.calcHap(1,100);
		md.calcHap(50,1000);
	}
	
	void calcHap(int start, int end) {
		int hap=0;
		for(int i=start;i<=end;i++) {
			hap+=i;
		}
		System.out.println(start + "부터 "+ end + "까지의 합은 " + hap + "입니다.");
	}

}

/*
 * 1. PascalCasing : Class, Interface, Enum
 * 2. camelCasing : variable, method
 * 3. Snake_Casing : 대소문자를 구분안할 때 사용
 * 4. kebbab-Casing : - 로 단어 사이 구분. 자바는 해당 x
 */