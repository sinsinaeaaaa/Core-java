
public class LoopDemo {
	public static void main(String[] args) {
//		//A-Z까지 출력하기
//		int i = 65; // initialization, 꼭 for 문 안에 넣는것이 아니라 for 바깥에 써도 된다.
//		for ( ; i<=90 ; ) {
//			System.out.printf("%c\t",(char)i);
//			//한 줄에 5개 알파벳만 출력하기
//			if(i%5==4) {
//				System.out.println();
//			}
//			i++; // 증감식을 이렇게 for문 안에 아래에 써주어도 된다.
//		}
//		System.out.println();
		
		
//		//1부터 100까지 4의 배수는 몇개일까
//		int i = 1; // initialization, 꼭 for 문 안에 넣는것이 아니라 for 바깥에 써도 된다.
//		int cnt = 0;
//		for ( ; i<=100 ; ) {
//			if(i%4==0) {
//				cnt++;
//			}
//			i++; // 증감식을 이렇게 for문 안에 아래에 써주어도 된다.
//		}
//		System.out.printf("4의 배수는 %d개 있습니다.", cnt);
		
		
		//윤년인지 아닌지 
		//400년마다 윤년이다.
		//혹은 4의 배수이지만, 100으로 나누어떨어지지 않으면 윤년이다.
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Year : ");
		int year = sc.nextInt();
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.printf("%d년은 윤년입니다.",year);
		} else {
			System.out.printf("%d년은 윤년이 아닙니다.",year);
		}
	}
}
