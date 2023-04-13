package s0330;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("N°ª ÀÔ·Â" );
		N=sc.nextInt();
		
		if(N<100) {
		for(int i=1;i<=N;i++) {
			if(i==N+1) break;
			System.out.print(i+"\t");
		}
		
		}
	}

}
