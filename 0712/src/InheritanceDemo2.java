// static 변수와 static 메소드는 상속되지 않는다.
public class InheritanceDemo2 {
	public static void main(String[] args) {
		Student jimin = new Student();
		System.out.println(jimin.age);
		System.out.println(Person.age);
	}
}
class Person {
	String name = "한지민";
	static int age = 28;
}

class Student extends Person{};