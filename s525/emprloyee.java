package s525;

public class emprloyee {
	String name;
	int no;
	int age;
	
	public emprloyee(){	
	}
	public emprloyee(String name, int no, int age){
		this.name=name;
		this.no=no;
		this.age=age;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		 this.no=no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		 this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		 this.age=age;
	}
	public String toString() {
		return "�̸�:"+name+"��ȣ:"+no+"����:"+age;
	}
	
	void print() {
		System.out.println("��������:"+toString());
	}
}
