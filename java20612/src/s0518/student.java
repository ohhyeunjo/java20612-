package s0518;

public class student {
	private String name;
	private int grade;
	static int count;
	
	student(){
		count++;
	}
	static int getCount() {
		return count;
	}
	
	String getName() {
		return name;
	}
	void setname(String name) {
		this.name = name;
	}
	int getGrade() {
		return grade;
	}
	void setgrade(int grade) {
		this.grade=grade;
	}
	void print() {
		System.out.println("�л��� �̸���"+name+"�̰�"+grade+"�г��Դϴ�.");
	}	
}
