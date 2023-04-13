package s0330;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 입력");
		N=sc.nextInt();
		
		for(int i=1; i<=N ;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(j);
			System.out.print("\n");
		}
	}

}
