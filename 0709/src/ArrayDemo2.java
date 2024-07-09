
public class ArrayDemo2 {
	public static void main(String[] args) {
//		//int [][] array; // 2차원 배열 선언
//		array = new int[4][3]; // 4행 3열 배열 생성. Rectangular array
//		// array = new int[4][]; // 행은 결정되고 열은 결정되지 않은 상태로 생성할 수 있다. 각 행마다 열의 개수가 다를 수도 있다(jagged array).
//		array[0][0] = 5; // 배열 할당
		
//		// 2차원 배열 초기회
//		int [][] array = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//				{10,11,12}
//		};
		
//		int [][] array;
//		array = new int[4][3]; //생성
//		array[0] = new int [] {1,2,3};
//		array[1] = new int [] {4,5,6};
//		array[2] = new int [] {7,8,9};
//		array[3] = new int [] {10,11,12};
		
		int [][] array ; //선언
		array = new int[4][]; //생성
		array[0] = new int[] {1,2,3,4}; // 열의 개수 4개
		array[1] = new int[2]; // 열의 개수 2개 이렇게 하고 값은 나중에 넣는법은 없나? 
		array[2] = new int[1]; // 열의 개수 1개
		array[3] = new int[5]; // 열의 개수 5개
		
		System.out.println(array.length);
		System.out.println(array[3].length);
		
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array[i].length;j++) {
				System.out.printf("array[%d][%d] = %d\t",i,j,array[i][j]);
			}
			System.out.println();
			
		}
		
	}
}
