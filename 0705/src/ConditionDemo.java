
public class ConditionDemo {
	public static void main(String[] args) {
		System.out.print("Favorite Season(spring, summer, fall, winter) : ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String season = sc.nextLine();
		
		switch(season) {
			case "spring" : System.out.print("봄 : 개나리, 진달래"); break;
			case "summer" : System.out.print("여름 : 장미, 아카시아"); break;
			case "fall" : System.out.print("가을 : 백합, 코스모스"); break;
			case "winter" : System.out.print("겨울 : 동백, 매화");
		}
		
//		if(season.equals("spring")) {
//			System.out.print("봄 : 개나리, 진달래");
//		} else if(season.equals("summer")) {
//			System.out.print("여름 : 장미, 아카시아");
//		} else if(season.equals("fall")) {
//			System.out.print("가을 : 백합, 코스모스");
//		} else {
//			System.out.print("겨울 : 동백, 매화");
//		}
	}

}
