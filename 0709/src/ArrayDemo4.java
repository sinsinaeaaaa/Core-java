
public class ArrayDemo4 {
	public static void main(String[] args) {
		double [] array = {3.14 , 89.5, 182.5, 69.5};
//		for(int i=0;i<array.length;i++) {
//			System.out.printf("%.2f\n", array[i]);
//		}
		
		// Enhanced for
		for (double aaa : array) { // array배열의 처음부터 끝까지 aaa로 가져오는 걸 반복. 반복횟수를 지정하지 못한다. collection과 배열에만 사용할 수 있다.;
			System.out.println(aaa);
		}
	}
}
