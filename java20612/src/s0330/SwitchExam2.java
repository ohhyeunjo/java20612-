package s0330;

import java.util.Scanner;

public class SwitchExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("�����Է�");
		a=s.nextInt();
		switch(a % 3) {
		case 0:
			System.out.println(a+"�� 3�� ���");
			break;
		default:
			System.out.println(a+"�� 3�ǹ���� �ƴϴ�");
		}
		s.close();
	}

}
