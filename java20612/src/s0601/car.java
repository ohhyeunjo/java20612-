package s0601;

public class car {
	private String name;
	protected String color;
	int velocity;
	
	car(){
		System.out.println("car 기본생성자");
	}
	car(String car){
		System.out.println("car 생성자");
	}
	
	void speedUp() {
		velocity+=5;
		System.out.println("속도증가:"+velocity);
	}
	void speedDown() {
		velocity-=5;
		System.out.println("속도감소:"+velocity);
	}
	
	String getname() {
		return name;
	}
	void setname(String name) {
		this.name=name;
	}
}
