// 중복 허용, 인덱스로 접근
import java.util.ArrayList;
import java.util.List;


public class ListDemo {
	public static void main(String[] args) {
		String [] array = {"한지민","박지민","홍지민","박지민","유지민","박지민","신지민"};
		List<String> list = new ArrayList<String>(5); // 괄호안에 숫자를 안 쓰면 방 10개 생성. 괄호 안에 숫자를 쓰면 그 개수만큼 생성. 초기화된 개수보다 늘어날 수 있다.
		for(String element : array) {
			list.add(element);
		}
		System.out.println("현재 방 개수는? " + list.size()); //7
		list.remove(0); // 인덱스 0에 있는 값 삭제
		System.out.println("현재 방 개수는? " + list.size()); //6
		System.out.println(list.get(1)); // 인덱스로 접근 . 홍지민
	}
}
