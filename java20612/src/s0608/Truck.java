package s0608;

public class Truck extends Car{
	int ton;
	void speedup() {
		velocity+=10;
		System.out.println("�ӵ�"+velocity+"����");
	}
	void speedup2() {
		super.speedup();
	}
	String name="Ʈ��";
	
	String print() {
		return"{���� ������ "+name+"�̴�.}";
	}
}
