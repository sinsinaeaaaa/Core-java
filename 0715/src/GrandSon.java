
public class GrandSon implements Son { // Son의 상속만 받았지만, Son의 부모인 mother, father로 상속, father의 부모인 grandfather로 상속.

	public static void main(String[] args) {
		GrandFather jimin = new GrandSon(); jimin.grandFather(); // grandfather는 grandfather것에만 접근 가능
		Father chulsu = new GrandSon(); chulsu.grandFather(); // father는 father와 grandfather 것에 접근 가능. mother, son에는 접근 불가능.
		Mother younghee = new GrandSon(); younghee.mother(); // mother는 mother 자기자신 것만 접근 가능. 자식것 접근 불가능'\
		Son youngsu = new GrandSon(); youngsu.son(); // 부모것과 부모의 부모 것, 자신것 모두 접근 가능.
		
		Son [] array = new Son[3];
		array[0] = new GrandSon(){};
		array[0].grandFather();
		
		System.out.println(Father.NAME + Mother.NAME);
	}
	
	@Override
	public void father() {
		System.out.println("Called by father()");
	}

	@Override
	public void grandFather() {
		System.out.println("Called by grandfather()");
	}

	@Override
	public void mother() {
		System.out.println("Called by mother()");
	}

	@Override
	public void son() {
		System.out.println("Called by son()");
	}
	
}
