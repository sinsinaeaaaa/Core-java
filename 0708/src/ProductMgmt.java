
public class ProductMgmt {
	public static void main(String[] args) {
//		// 여러 상품을 출력하기
//		Product pencil = new Product();
//		pencil.name = "모나미 연필";
//		pencil.price = 1000;
//		System.out.printf("name = %s, price = %,d원\n", pencil.name, pencil.price);
//		
//		Product computer = new Product();
//		computer.name = "컴퓨터";
//		computer.price = 2000000;
//		System.out.printf("name = %s, price = %,d원\n",computer.name, computer.price);

		// 여러 상품을 배열을 이용해서 입력받고 출력하기
		Product [] array = new Product[2];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int i = 0; //초기값
		while ( i < 2) {
			array[i] = new Product();
			System.out.print("Name : "); array[i].name = sc.next();
			System.out.print("Price : "); array[i].price = sc.nextInt();
			i++;
		}
		for (i=0 ; i<2 ; i++) {
			System.out.printf("Name = %s, Price = %,d\n", 
					array[i].name, array[i].price);
		}
	
	}
}
