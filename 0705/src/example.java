
public class example {
	public static void main(String [] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("값 입력(초단위) : ");
		int sec = sc.nextInt();
		
		int h = sec / 3600;
		int m = (sec % 3600) / 60;
		int s = (sec % 3600) % 60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초입니다. \n", sec,h,m,s);
	}
	
}