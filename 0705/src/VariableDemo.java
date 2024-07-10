
public class VariableDemo {

	int eng = 100; // instance variable
	static int math = 80; // class variable
	
	
	public static void main(String[] args) {
		int kor = 90 ; //local variable , initialization 해야만 사용가능하다.
		System.out.printf("수학 점수 = %d\n" , math); // main 보다 먼저 math변수가 생성되었기 때문에 사용할 수 있다.
		System.out.printf("국어 점수 = %d\n" , kor);
		
		//System.out.printf("영어 점수 = %d\n" , eng); // 에러발생 : eng는 instance variable이고, static이 아니라서 main 안에서 사용할 수 없다.
		VariableDemo vd = new VariableDemo();
		System.out.printf("영어 점수 = %d\n" , vd.eng); // vd. 를 붙여서 eng 변수를 호출해서 사용할 수 있다.
		
		Demo d = new Demo();
		System.out.printf("영어 점수 = %d\n" , d.eng); // d. 를 붙여서 eng 변수를 호출해서 사용할 수 있다.
	}

}
class Demo {
	static int math = 70; // class variable
	int eng = 50;
}