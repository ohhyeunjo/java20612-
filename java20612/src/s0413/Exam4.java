package s0413;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] name=new String[2];
		int score[][]=new int[2][3];
		int sum;
		double avg;
		
		for (int i=0; i<2; i++) {
			System.out.println("�л�"+i+1+"�̸� �Է�: ");
			name[i]=sc.next();
			
			for (int j=0; j<3; j++) {
				System.out.print("����"+j+1+"�Է�:");
				score[i][j]=sc.nextInt();
			}
		}
		System.out.println("***********�Է� �Ϸ�************");
		for(int i=0; i<2; i++) {
			sum = 0;
			for(int j=0;j<3;j++)
				sum += score[i][j];
			System.out.println(name[i]+"������ ������"+sum+"���̰�");
			avg=sum/3;
			System.out.printf("����� %.2f�� �Դϴ�.\n", avg);
			if(avg>=90)
				System.out.println(name[i]+"������ ������ a�Դϴ�.");
			else if(avg>=80)
				System.out.println(name[i]+"������ ������ b�Դϴ�.");
			else if(avg>=70)
				System.out.println(name[i]+"������ ������ c�Դϴ�.");
			else if(avg>=60)
				System.out.println(name[i]+"������ ������ d�Դϴ�.");
			else 
				System.out.println(name[i]+"������ ������ f�Դϴ�.");
		}
	}

}
