import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		String [] array = {"한지민","박지민","홍지민","박지민","유지민","박지민","신지민"};
		Stack<String> stack = new Stack<String>() ;
		for (String element : array) {
			stack.push(element);
		}
		System.out.println(stack.peek()); // 신지민,제일 마지막에 입력된 값만 출력 
		System.out.println(stack.peek()); // 신지민,제일 마지막에 입력된 값만 출력 
		System.out.println(stack.peek()); // 신지민,제일 마지막에 입력된 값만 출력 
		
		System.out.println(stack.pop()); // 신지민, 제일 마지막에 입력된 값만 출력하고 제거 
		System.out.println(stack.pop()); // 박지민, 제일 마지막에 입력된 값만 출력하고 제거 
		System.out.println(stack.pop()); // 유지민, 제일 마지막에 입력된 값만 출력하고 제거
		
		while(!stack.empty()) System.out.println(stack.pop());
//		박지민
//		홍지민
//		박지민
//		한지민
	
	}
}
