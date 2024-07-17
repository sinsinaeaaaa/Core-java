
public class EqualsDemo {
	public static void main(String[] args) {
		Point original = new Point(30,100);
		Point target = new Point(30,100);
		original.equals(target); // String 에서는 equals 를 재정의해서 값을 비교하지만, 재정의 되지 않은 equals는 주소를 비교한다. 
		System.out.println(original.equals(target)); // true 출력
	}
}
class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x = x; this.y=y;
	}
	@Override
	public String toString() {
		return String.format("(x,y) = (%d, %d))\n",this.x, this.y);
	}
	@Override
	public boolean equals(Object obj) { // 값을 비교하도록 equals 를 재정의 하기.
		Point p = (Point) obj;
		if(this.x == p.x && this.y == p.y) return true;
		else return false;
	}
}
