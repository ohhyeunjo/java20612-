package s0330;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		int even = 0, odd = 0;
		Scanner s=new Scanner(System.in);
		System.out.println("N�Է�:");
		N=s.nextInt();
		
		for(int i=0;i<=N; i++)
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		System.out.println("1����"+N+"������");
		System.out.println("¦���� ����"+even);
		System.out.println("Ȧ���� ����"+odd);
	}

}
