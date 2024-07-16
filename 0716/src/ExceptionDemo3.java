
public class ExceptionDemo3 {
	public static void main(String[] args) {
		Student chulsu = new Student(); // chulsu.setKor(120);
//		System.out.println(chulsu);
		try {
			chulsu.setKor(100);
			chulsu.setHistory(120); // 일반 예외는 무조건 try catch문으로 감싸줘야 함. 혹은 throws 써준다.
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(chulsu);
		
	}
}
class HistoryException extends Exception{ // checked exception 
	public HistoryException(String msg) {
		super(msg);
	}
}
class KoreanException extends RuntimeException {
	public KoreanException(String msg) { //생성자
		super(msg);
	}
}
class Student {
	private int kor;
	private int history;
	public void setHistory(int history) throws HistoryException { //throws 는 check exception을 throw하는 메소드라면 반드시 써줘야 한다.
		if(history >= 0 && history <= 100) this.history = history;
		else throw new HistoryException("역사 점수는 0부터 100점까지의 범위만 인정합니다."); //throw 로 에러를 호출한 위치로 전달한다.
	}
	public void setKor(int kor) throws KoreanException { //throws 생략 가능. 런타임 exception 이므로
		if(kor >= 0 && kor <= 100) this.kor = kor;
		else throw new KoreanException("국어 점수는 0부터 100점까지의 범위만 인정합니다."); //throw 로 에러를 호출한 위치로 전달한다.
	}
	@Override
	public String toString() {
		return "kor = " + this.kor + " history = " + this.history;
	}
}
