/**
 * @author Shinae
 * @version 1.1.0
 * @since jdk 17
 * 
 */
public class EnumDemo {
	public static void main(String[] args) {
//		Season season = new Season(); // 기존 class나 interface 처럼 사용할 수 없다.
		Season season = Season.fall;
		System.out.println(season);// fall 
		System.out.println(season.ordinal());//2
	}
}
