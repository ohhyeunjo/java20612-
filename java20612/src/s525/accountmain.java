package s525;

import java.util.Scanner;

public class accountmain {

	public static void main(String[] args) {
		account a1=new account("������",12345678,10000);
		a1.printInfo();
		//1
		Scanner sc = new Scanner(System.in);
		int money;
		while(true) {
			a1.printmenu();
			int menu = sc.nextInt();
			if(menu==4) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}
			else if(menu==1) {
				System.out.println("�Ա��� �ݾ�: ");
				money = sc.nextInt();
				a1.deposit(money);
			}
			else if(menu==2) {
				System.out.println("����� �ݾ�: ");
				money = sc.nextInt();
				a1.withdraw(money);
			}
			else if(menu==3) {
				a1.printInfo();
			}
			else {
				System.out.println("�ٽ��Է��ϼ���");
			}
		}
	}
}
