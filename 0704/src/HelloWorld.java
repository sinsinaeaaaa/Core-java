
public class HelloWorld { // public : 누구나 접근할 수 있다.
	public static void main(String [] args) { 
	// void : 무치형, 아무것도 넘기지 않는 타입, args : 아무이름으로 해도 됨. static : class 바깥에 존재한다. class가 아파트라면 static은 놀이터
	// public static void main(String [] args) 는 늘 사옹하는 구문. 
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("당신의 이름은? : ");
		String name = sc.nextLine();
		System.out.printf("귀하의 이름은 %s 입니다. \n", name);
	}
}
// 한 파일에는 단 하나의 public class만 존재.
// public class의 이름을 파일명으로 저장해야함.
// (이클립스에서는)한 파일에 하나의 class만 넣는것으로 하자. 