// this 용법
/*
 * 1. this. : 나의 주소
 * 2. this : 나
 * 3. this() : 나의 생성자
 */

public class ThisDemo {
	public static void main(String[] args) {
		Car sonata = new Car();
		sonata.setName("현대 소나타");
		sonata.setPrice(30_000_000);
		System.out.println("이름 = " + sonata.getName() + ", 가격 : " + sonata.getPrice());
		Car matiz = sonata.clone();//주소복사
		System.out.println(matiz.getName()); //"현대 소나타" 출력, 주소를 받았기 때문에 sonata자체와 똑같은 값을 가진다.
	}	
}