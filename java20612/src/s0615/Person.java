package s0615;

public class Person {
	String name;
	int age;
	void printInfo() {
		System.out.println(name+"�� ���̴�"+age+"���Դϴ�");
	}
}

class Student extends Person{
	boolean online;

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		if(online) {
			System.out.println(name+"�� �л��̸� ���� �¶��� �������Դϴ�");
		}else {
			System.out.println(name+"�� �л��̸� ���� � �������Դϴ�");
		}
	}
	
}
class SoccerPalyer extends Person{
	String teamName;

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(name+"��"+teamName+"�౸�����Դϴ�");
	}
	
}