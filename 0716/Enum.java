public class Season {
	private String spring, summer, fall, winter;
}

public interface Season {
	String spring, summer, fall, winter;
}

public enum Season{
	spring, summer, fall, winter; // 타입을 String으로 할지 int로 할지 앞에 선언 x. 단순 나열만 한다.
}