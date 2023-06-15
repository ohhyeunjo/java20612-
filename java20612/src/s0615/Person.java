package s0615;

public class Person {
	String name;
	int age;
	void printInfo() {
		System.out.println(name+"의 나이는"+age+"살입니다");
	}
}

class Student extends Person{
	boolean online;

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		if(online) {
			System.out.println(name+"은 학생이며 현재 온라인 수업중입니다");
		}else {
			System.out.println(name+"은 학생이며 현재 등교 수업중입니다");
		}
	}
	
}
class SoccerPalyer extends Person{
	String teamName;

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(name+"는"+teamName+"축구선수입니다");
	}
	
}