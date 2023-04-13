package s0330;

import java.util.Scanner;

public class SwitchExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("정수입력");
		a=s.nextInt();
		switch(a % 3) {
		case 0:
			System.out.println(a+"는 3의 배수");
			break;
		default:
			System.out.println(a+"는 3의배수가 아니다");
		}
		s.close();
	}

}
