
public class ProductInput {
	void input(Product [] array) throws java.io.IOException{
		java.util.Scanner sc = new java.util.Scanner(new java.io.File("productdata.txt"));
		for (int i=0;i<array.length;i++) {
			String line = sc.nextLine();
			String [] itemArray = line.split("\\s+"); // Parsing
			
			array[i] = new Product();
			
			array[i].setName(itemArray[0].trim()); 
			array[i].setQty(Integer.parseInt(itemArray[1].trim()));
			array[i].setSalePrice(Integer.parseInt(itemArray[2].trim()));
			array[i].setInPrice(Integer.parseInt(itemArray[3].trim()));
			array[i].setMove(Integer.parseInt(itemArray[4].trim()));
		}
	}
}
