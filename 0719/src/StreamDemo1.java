
import java.util.Random;
import java.util.stream.IntStream;

/*
 * 한번 사용한 Stream은 재사용할 수 없는 일회성 객체이기 때문이다.
 * 따라서 필요하다면 다시 생성해야 한다.
 */
public class StreamDemo1 {
	public static void main(String[] args) {
//		IntStream is = IntStream.rangeClosed(1, 100); // 스트림 생성
//		int sum = is.sum(); //최종연산, 리턴 타입이 Stream이 아닌 순간 최종연산이 된 것. Stream이 소진이 되었다.
//		
//		long count = is.count(); // Stream이 이미 소진이 되었기 때문에 불가능한 코드이다. 컴파일에서는 에러가 발생하지 않음. 런타임 에러가 발생함.
		
		// 1부터 100 사이에 난수를 발생하여 중복을 배제하고 5개만 뽑아서 소팅까지 수행하자.
		IntStream sortedInt = new Random().ints(1,100).distinct().limit(5).sorted();
		sortedInt.forEach(i -> System.out.print(i + ",\t"));
	}
}
