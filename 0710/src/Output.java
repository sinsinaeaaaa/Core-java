
public class Output {
	void output(Student std) {
//		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t평점");
//		System.out.println("-------------------------------------");
//		System.out.printf("%-10s%5d%5d\t%5d\t%5d\t%7.1f\t%3c\n"
//				,std.hakbun, std.kor,std.eng,std.math,std.tot,std.avg, std.grade);
		
		// 출력을 외부에서말고 내부에서 하도록 Student.java에 추가
		std.print(); // method를 호출만 하면 됨.
	}
}
