/**
 * @author Shinae
 * @version 1.0.0
 * @since jdk 17
 * 
 */
public enum Season {
	spring(5), summer(100), fall(1000), winter(30_000_000);  // 맨 위에 써줘야 한다.
	private int value;
	Season(int value) { //생성자이지만 public으로 할 수 없다.
		this.value = value;
	}
	public int getValue () {
		return this.value;
	}
}
