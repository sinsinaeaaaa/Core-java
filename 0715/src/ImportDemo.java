// import 3번째 방법
// jar 파일을 만들어서 classpath 에 add 시켜서 적용하자.
import kr.seoul.sesac.util.libs.*;
public class ImportDemo {
	public static void main(String[] args) {
		Finance f = new Finance();
		Humanresource hr = new Humanresource();
		System.out.println(f.money);
		System.out.println(hr.salary);
	}
}
