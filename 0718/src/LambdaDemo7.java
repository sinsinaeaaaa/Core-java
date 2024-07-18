/*
 * Collection Framework 와 Lambda Expression
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo7 {
	public static void main(String[] args) {
//		List <Integer> list = Arrays.asList(4,6,22,4,5,38,3);
		List<String> list = Arrays.asList("한강", "두만강", "낙동강", "압록강", "양산강", "금강");
		//1st way
//		Collections.sort(list, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer front, Integer back) {
//				return front - back; //오름차순
//			}
//			
//		});
		
		//2nd way
//		Collections.sort(list, (front, back)-> back-front); //내림차순. 숫자 비교
		Collections.sort(list, (front, back)-> front.compareTo(back)); // 오름차순 문자비교 [금강, 낙동강, 두만강, 압록강, 양산강, 한강]
		System.out.println(list);
	}

}
