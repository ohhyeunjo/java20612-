package s0608;

public class Car {
	String name;
	String color;
	int velocity;
	void speedup() {
		velocity+=5;
		System.out.println("속도"+velocity+"증가");
	}
	void speeddown() {
		velocity-=5;
		System.out.println("속도"+velocity+"감소");
	}
	String name1="차";
	
	String print() {
		return "{나는 "+name+"이다.}";
	}
}
