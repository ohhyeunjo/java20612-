package s0608;

public class Car {
	String carname;
	String color;
	int velocity;
	void speedup() {
		velocity+=5;
		System.out.println("�ӵ�"+velocity+"����");
	}
	void speeddown() {
		velocity-=5;
		System.out.println("�ӵ�"+velocity+"����");
	}
}
