package s0316;

public class Exam02 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = "abc";
		if (str1==str2)
			System.out.println("鞍篮林家");
		else
			System.out.println("促弗林家");
		String str3 = "abc";
		String str4 = "abc";
		if (str3==str4)
			System.out.println("鞍篮林家");
		else
			System.out.println("促弗林家");
		
		str3 = "qqq";
		System.out.println(str4);
	}

}
