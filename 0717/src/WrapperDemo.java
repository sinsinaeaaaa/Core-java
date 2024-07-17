
public class WrapperDemo {
	public static void main(String[] args) {
//		// Before jdk 1.5
//		int su = 5;
//		Integer in = new Integer(su); // Wrapping, Boxing . 예전 방식
//		int another = in.intValue();
//		System.out.println(another);
		
		//After jdk 1.5
		int su = 5;
		Integer in = su; // Auto Boxing 
		int another = in; // Auto Unboxing
	}
}
