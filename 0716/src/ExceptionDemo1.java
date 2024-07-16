
public class ExceptionDemo1 {
	public static void main(String [] args) {
		Car matiz = new Car();
		matiz.name = "대우 마티즈";
		System.out.println(matiz.name);
		matiz=null;
		try {
			System.out.println(matiz.name);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage()); //에러 메세지만
			System.out.println(e); //e.toString, 에러 메시지와 Exception Type
			e.printStackTrace();
		}catch(NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		}catch(RuntimeException e) { // Runtime exception을 맨 위에 쓰면 아래에러들(runtime에러의 자식)은 도달하지 못해서 에러가 발생한다. 따라서 맨 밑에 써줘야 함.
			System.out.println(e.getMessage());
		}
		
	}
}
