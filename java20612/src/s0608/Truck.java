package s0608;

public class Truck extends Car{
	int ton;
	void speedup() {
		velocity+=10;
		System.out.println("속도"+velocity+"증가");
	}
	void speedup2() {
		super.speedup();
	}
	String name="트럭";
	
	String print() {
		return"{차의 종류는 "+name+"이다.}";
	}
}
