package s0330;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("N°ª ÀÔ·Â" );
		N=sc.nextInt();
		
		for(int i=N; i>=1 ;i--) {
			for(int j=1; j<=i; j++)
				System.out.print("*"+"\t");
			System.out.print("\n");
	}
	}

}
