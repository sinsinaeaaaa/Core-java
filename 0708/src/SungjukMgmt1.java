
public class SungjukMgmt1 {
	public static void main(String[] args) {
		Student[] array = new Student[2]; // 학생 정보가 들어갈 공간을 만든거지, Student를 만든 것이 아니다.
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		for (int i=0 ; i < 2 ; i++) {
			array[i] = new Student(); // 참조형 배열에서 써줘야 하는 부분. Student를 만들어 줘야 한다.
			
			System.out.print("학번 : "); array[i].hakbun = sc.next();
			System.out.print("국어 : "); array[i].kor = sc.nextInt();
			System.out.print("영어 : "); array[i].eng = sc.nextInt();
			System.out.print("수학 : "); array[i].math = sc.nextInt();
			
			array[i].tot = array[i].kor + array[i].eng + array[i].math;
			array[i].avg = array[i].tot / 3.;
		}
		for(int i=0; i<2 ; i++) {
			System.out.printf("%10s \t %5d \t %5d \t %5d \t %5d \t %10.1f \n",
					array[i].hakbun, array[i].kor, array[i].eng, array[i].math,
					array[i].tot, array[i].avg);
		}
	}
}