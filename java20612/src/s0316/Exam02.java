package s0316;

public class Exam02 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = "abc";
		if (str1==str2)
			System.out.println("�����ּ�");
		else
			System.out.println("�ٸ��ּ�");
		String str3 = "abc";
		String str4 = "abc";
		if (str3==str4)
			System.out.println("�����ּ�");
		else
			System.out.println("�ٸ��ּ�");
		
		str3 = "qqq";
		System.out.println(str4);
	}

}
