
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Frog f = new Frog();
//		f.name // name은 private 이라서 사용할 수 없다.
	}

}
class 양서류{
	private String name;
	int weight;
}
class Frog extends 양서류{
	
}