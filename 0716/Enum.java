public class Season {
	private String spring, summer, fall, winter;
}

public interface Season {
	String spring, summer, fall, winter;
}

public enum Season{
	spring, summer, fall, winter; // Ÿ���� String���� ���� int�� ���� �տ� ���� x. �ܼ� ������ �Ѵ�.
}