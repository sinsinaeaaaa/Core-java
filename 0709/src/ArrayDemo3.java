
public class ArrayDemo3 {
	public static void main(String[] args) {
//		// 배열의 주소 복사
//		int [] original = {3,4,5} ;
//		int [] target = original;
//		
//		target[0]=100; // 같은 주소를 공유하므로 original[0]도 100을 출력한다. 같은 값을 공유하게 되는 것.
		
		// 배열의 값 복사
		int [] original = {3,4,5};
		int [] target = new int[10];
		System.arraycopy(original, 0, target, 7, 3); // 맨 뒤 매개변수는 original에서 가져올 값의 개수, 7은 target의 값을 채워넣기 시작할 인덱스
	}
}
