package s0330;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("N°ª ÀÔ·Â" );
		N=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			if(i==N) continue;
			System.out.print(i+"\t");
		}
		
	}

}
