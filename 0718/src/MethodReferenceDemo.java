// Method Reference
/*
 * Lambda expression의 구현 코드에서 다른 클래스의 단 하나의 메소드만 참조한다는 것을 보장한다면
 * class명::method명 
 */

public class MethodReferenceDemo {
	public static void main(String[] args) {
		MyPolygon mp = (radian) -> Math.toDegrees(radian);
		double result = mp.radianToDegree(1);
		System.out.println(result);	
		
		MyPolygon mp1 = Math::toDegrees; //ClassName::methodName
		double result1 = mp1.radianToDegree(1);
		System.out.println(result1);
	}
}

@FunctionalInterface
interface MyPolygon{
	double radianToDegree(double value);
}