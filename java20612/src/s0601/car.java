package s0601;

public class car {
	private String name;
	protected String color;
	int velocity;
	
	car(){
		System.out.println("car �⺻������");
	}
	car(String car){
		System.out.println("car ������");
	}
	
	void speedUp() {
		velocity+=5;
		System.out.println("�ӵ�����:"+velocity);
	}
	void speedDown() {
		velocity-=5;
		System.out.println("�ӵ�����:"+velocity);
	}
	
	String getname() {
		return name;
	}
	void setname(String name) {
		this.name=name;
	}
}
