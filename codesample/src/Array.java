public class Array {
	public static void main(String[] args) {
		//선언 - 생성 - 할당
		int [] array;
		array = new int[4];
		array[0] = 1; array[2]=3;
		
		//초기화 하기 - 방법1
		int [] array1 = null;
		array1 = new int[] { 1,2,3,4};
		
		
		//초기화 하기 - 방법2 (제일 간단함)
		int [] array2 = {1,2,3};
	}
}