
public class InitializationBlock {
	private double weight; //member변수
	private char grade;
	{
		this.weight = 100.0; this.grade = 'F';
		System.out.println("나는 초기화 블록");
	}
	public InitializationBlock() {
		this.weight = 62.4;
		this.grade = 'C';
		System.out.println("나는 생성자 블록");
	}
	public static void main(String[] args) {
		InitializationBlock jimin = new InitializationBlock();
		System.out.println(jimin.weight + "kg");
		System.out.println(jimin.grade);
	}
}
