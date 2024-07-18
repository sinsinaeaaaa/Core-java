import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(4,6,8,12);
//		List<String> list1 = Arrays.asList("한지민","홍지민","박지민","김지민");
		int [] array = {5,7,1,2,4,3,9,4};
		Arrays.sort(array);
		for(int a : array) {
			System.out.print(a+",");
		}
	}
}
