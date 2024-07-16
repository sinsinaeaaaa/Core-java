
public class ExceptionDemo2 {
	public static void main(String[] args) {
		a();
	}
	static void a() {
		b();
	}
	static void b() {
		try {
			c();
		} catch(ArithmeticException e) {
			System.out.println("b에서 잡았음.");
		}
	}
	static void c() {
		d();
	}
	static void d() {
		System.out.println(5/0);
	}
}
// "calling stack"
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at ExceptionDemo2.d(ExceptionDemo2.java:16)
//at ExceptionDemo2.c(ExceptionDemo2.java:13)
//at ExceptionDemo2.b(ExceptionDemo2.java:10)
//at ExceptionDemo2.a(ExceptionDemo2.java:7)
//at ExceptionDemo2.main(ExceptionDemo2.java:4)

