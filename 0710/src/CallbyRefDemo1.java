
public class CallbyRefDemo1 {
	public static void main(String[] args) {
		Student younghee = new Student();
		new Input().input(younghee); // input method는 멤버 메소드. 한번만 사용할 때는 참조변수 생성 안하고 이렇게 써도 된다.
		new Calc().calc(younghee);
		new Output().output(younghee);
	}
}
