
public class SungjukMnmt {

	public static void main(String[] args) {
		Student chulsu = new Student();// chulsu 인스턴스 메모리는 무조건 8byte, new연산자를 사용해서 instance 생성.
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String y_n = null;
		do {
			System.out.print("학번 : ");
			chulsu.hakbun = sc.next(); //nextLine()을 쓰게 되면 이전에 입력한 '엔터'값을 가져오게 되므로 학번을 입력할 수 없게 된다. next()는 공백이 나올때까지 입력받을 때 사용.
			System.out.print("국어 : ");
			chulsu.kor = sc.nextInt();
			System.out.print("영어 : ");
			chulsu.eng = sc.nextInt();
			System.out.print("수학 : ");
			chulsu.math = sc.nextInt();
			chulsu.tot = chulsu.kor + chulsu.eng + chulsu.math;
			chulsu.avg = chulsu.tot / (double) 3; // 분모나 분자 중 하나라도 double형이어야 함. chulsu.avg가 double형이기 때문.
			chulsu.grade = '\0'; // NULL 값으로 초기화
			
			switch((int)(chulsu.avg/10)) {
				case 10: case 9: chulsu.grade = 'A'; break;
				case 8: chulsu.grade = 'B'; break;
				case 7: chulsu.grade = 'C'; break;
				case 6: chulsu.grade = 'D'; break;
				default: chulsu.grade = 'F';
			}
			System.out.printf("%10s\t%5d\t%5d\t%5d\t%5d\t%10.1f\t%3c\n", chulsu.hakbun, chulsu.kor, chulsu.eng, chulsu.math, chulsu.tot, chulsu.avg, chulsu.grade);
			System.out.print("Again(y/n) : "); 
			y_n = sc.next();
		} while(y_n.equals("Y") || y_n.equals("y"));
		System.out.println("Program is over...");
	}
}