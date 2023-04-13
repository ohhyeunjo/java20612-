package s0406;

public class Student {
	String name;
	int numder;
	String phone;
	static String School="서울로봇고";
	static int count=0;
	
	Student(){
		count++;
		System.out.println("생성자:"+count);
	}
		
	
}
