package s0323;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a:");
		a=sc.nextInt();
		
		System.out.print("b:");
		b=sc.nextInt();
		
		System.out.print("������:");
		char c=sc.next().charAt(0);
		
		if(c=='+')
			System.out.println(a + "+" + b + "=" + (a+b));
		else if(c=='-')
			System.out.println(a + "-" + b + "=" + (a-b));
		else if(c=='*')
			System.out.println(a + "*" + b + "=" + (a*b));
		else if(c=='/')
			System.out.println(a + "/" + b + "=" + (a/b));
		else
			System.out.println("��Ģ�����ڰ� �ƴմϴ�");
		
		
//		if (a%2==0) System.out.println(a+"�� ¦�� �Դϴ�");
//		else System.out.println(a+"�� Ȧ�� �Դϴ�");

		
	}

}
