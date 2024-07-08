public class bmi {
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("신장(cm) : ");
		double h_cm = sc.nextDouble();
		double h_m = h_cm/100;
		
		System.out.print("몸무게(kg) : ");
		double w = sc.nextDouble();	
		double bmi = w / (h_m * h_m);
		
		String status = "";
		if(bmi < 18.5) {
			status = "저체중";
		} else if(bmi < 22.9) {
			status = "정상";
		} else if(bmi < 24.9) {
			status = "비만전단계";
		} else if(bmi < 29.9) {
			status = "1단계비만";
		} else if(bmi < 34.9) {
			status = "2단계비만";
		} else {
			status = "3단계비만";
		}
		System.out.print("--------------\n");
		System.out.printf("%s님은 BMI지수 %.1f이고 %s입니다.",name, bmi, status);
	}

}