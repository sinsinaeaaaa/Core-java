
public class SungjukMgmt1 {
	public static void main(String[] args) throws java.io.IOException{
		Student [] stdArray = new Student[3]; // 앞으로 학생들의 정보가 저장될 공간 확보
		java.util.Scanner sc = new java.util.Scanner(new java.io.File("sungjuk.dat"));
		for(int i=0; i < 3; i++) {
			stdArray[i] = new Student(); // 학생 공간 확보
			
			String line = sc.nextLine();
			String [] array = line.split("\\s+"); // Parsing
			
			stdArray[i].hakbun = array[0].trim();
			stdArray[i].name = array[1].trim();
			stdArray[i].kor = Integer.parseInt(array[2].trim());
			stdArray[i].eng = Integer.parseInt(array[3].trim());
			stdArray[i].math = Integer.parseInt(array[4].trim());
		}
		int j=0;
		while(j<3) {
			System.out.printf("%10s\t %10s\t %5d\t %5d\t %5d\n",
					stdArray[j].hakbun, stdArray[j].name
					, stdArray[j].kor, stdArray[j].eng, stdArray[j].math);
			
			j++;
		}
	}
}
