package s525;

public class student {
	String name;
	int grade;
	
	student(){}
	student(String name){
		this.name = name;
	}
	student(String name , int grade){
		//this.name=name;
		this(name);
		this.grade=grade;
	}
	
	void print() {
		System.out.println("�л� �̸�"+name+"�г�:"+grade);
	}
	
	void print2() {
		System.out.println("�л� �̸�"+getName()+"�г�:"+getGrade());
	}
	
	String getName() {
		return name;
	}
	int getGrade() {
		return grade;
	}
	
	void setName(String name) {
		this.name = name;
	}
	void setGrade(int grade) {
		this.grade=grade;
	}
}
