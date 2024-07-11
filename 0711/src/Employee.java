
public class Employee {
	String sabun;
	double salary;
	
	public Employee() {
		this("Unsetted",10_000_000);//내가 나의 또다른 생성자를 호출한다.15번째줄에있는 생성자를 호출한 것.
	}
	public Employee(String sabun) {
		this(sabun,10_000_000); // 15번째줄에있는 생성자를 호출 
	}
	public Employee(double salary) {
		this("Unsetted",salary); // 15번째줄에있는 생성자를 호출
	}
	public Employee(String sabun, double salary) {
		this.sabun = sabun;
		this.salary = salary;
	}
}
