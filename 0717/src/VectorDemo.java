import java.util.Vector;
import java.util.List;
// 스레드를 사용할 때 Vector 가 좋다. 동기화 관련.
// 스레드를 안 쓰면 array가 낫다.


public class VectorDemo {
	public static void main(String[] args) {
		String [] array = {"한지민","박지민","홍지민","박지민","유지민","박지민","신지민"};
		Vector<String> list = new Vector<String>(5,1); // 5,1 은 초기 생성 개수는 5이지만 모자르면 1개씩증가하라는 뜻. 5,3 은 5개가 넘으면 3개가 추가되어서 바로 8개가 된다.
		for(String element : array) {
			list.add(element);
		}
		System.out.println("현재 방 개수는? " + list.size()); //7
		list.remove(0); // 인덱스 0에 있는 값 삭제
		System.out.println("현재 방 개수는? " + list.size()); //6
		System.out.println(list.get(1)); // 인덱스로 접근 . 홍지민
	}
}
