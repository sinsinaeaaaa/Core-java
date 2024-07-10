
public class Student {
	private String hakbun, name; // Field, 속성(Attribute, property, state)
	private int kor;
	private int eng; // private로 하면 외부에서는 존재하는지 알 수 없음. 숨겨진다.
	private int math;
	private int tot;
	private double avg;
	private char grade;
	
	public void print() {
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t평점");
		System.out.println("-------------------------------------");
		System.out.printf("%-10s%5d%5d\t%5d\t%5d\t%7.1f\t%3c\n"
				,hakbun, kor, eng, math, tot, avg, grade);
	}
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
}
