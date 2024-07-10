
public class Input {
	void input(Student std) { //입력만 받는 메소드 std = younghee 즉 call by reference. 멤버 메소드
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("학번 : "); 
		String hakbun = sc.next();
		std.setHakbun(hakbun);
		System.out.print("국어 : "); 
		std.setKor(sc.nextInt()); // 입력을 받고 setKor 인자로 바로 사용
		System.out.print("영어 : "); 
		std.setEng(sc.nextInt());
		System.out.print("수학 : "); 
		std.setMath(sc.nextInt());
	}
}
