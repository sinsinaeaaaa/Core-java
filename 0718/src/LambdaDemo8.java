import java.util.Arrays;
import java.util.List;

public class LambdaDemo8 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("사과","배","딸기","복숭아","레몬","망고","수박");
		// list에 저장 된 각 element를 iterate로 출력하기
		// 1st way
		for (int i =0; i<list.size();i++) {
			System.out.println(list.get(i) + ", ");
		}
		
		//2nd way
		for (String str : list) {
			System.out.println(str + ", ");
		}
		
		//3rd way . List와 Map은 forEach가 있다.
		list.forEach(str -> System.out.println(str + ", "));
	}
}
