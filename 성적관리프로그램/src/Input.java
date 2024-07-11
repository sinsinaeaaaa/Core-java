import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
    private Scanner sc;
    private Student[] array;

    // 생성자
    public Input(Student[] array) throws FileNotFoundException {
        this.sc = new Scanner(new java.io.File("sungjuk_utf8.txt"));
        this.array = array;
    }

    // 패키지 내 접근
    void input() {
        for (int i = 0; i < array.length; i++) {

            String line = sc.nextLine();
            // 문자얼 파싱
            Scanner s = new Scanner(line).useDelimiter("\\s+");
            String hakbun = s.next();
            String name = s.next();
            int kor = s.nextInt();
            int eng = s.nextInt();
            int mat = s.nextInt();
            int edp = s.nextInt();
            
            this.array[i] = new Student(hakbun, name, kor, eng, mat, edp);

        }
    }

}