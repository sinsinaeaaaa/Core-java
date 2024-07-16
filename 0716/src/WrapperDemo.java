
public class WrapperDemo {
	public static void main(String[] args) {
//		//1.4 이전까지
//		int su=5; //stack에 있는 5
//		Integer in = new Integer(su); // Heap 에 있는 5, wrapping 혹은 boxing 이라고 함.
//		int another = Integer. //unwrapping 혹은 unboxing 
		
		int su = 5;
		Integer in = su; //auto boxing
		int another = in; //auto unboxing
	}
}
