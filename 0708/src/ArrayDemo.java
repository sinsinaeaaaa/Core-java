
public class ArrayDemo {
//	public static void main(String[] args) {
//		int [] age; // declaration , 배열 선언 []를 변수명 앞에 쓴다.
//		age = new int[4] ; //creation, 배열을 이 단계가 필요하다. 사이즈도 정함.
//		age[0]=6; age[1]=7; age[2]=8; age[3]=9; // assignment, age[0]는 4바이트. age[3]는 age[0]의 주소로부터 12바이트 떨어져 있다.
//		
////		char[] array = null;
////		array = new char []{'a','b','c','d'}; // initialization 방법1
//		
//		//char [] array = {'a','b','c','d'}; // initialization 방법2
//		
//		String [] array = {"Hello","World","Good","Java","A"};
//	}
	
	
	public static void main(String [] args) {
//		int [] array;
//		array = new int[4];
//		array[0] = 5; array[1]=6; array[2]=7; array[3]=8;
//		for (int i=0; i <4 ; i++) {
//			System.out.print("array[" + i + "] = " + array[i] + '\t');
//		}
//		System.out.println();
		String [] array = {"Hello","World","Good","Java","A"}; // initialization
		array[3] = "Python"; // 해당 인덱스에 값을 바꾸기
		
		// 출력하기
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}
}