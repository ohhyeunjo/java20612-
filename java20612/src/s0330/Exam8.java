package s0330;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		int even = 0, odd = 0;
		Scanner s=new Scanner(System.in);
		System.out.println("N입력:");
		N=s.nextInt();
		
		for(int i=0;i<=N; i++)
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		System.out.println("1부터"+N+"까지의");
		System.out.println("짝수의 합은"+even);
		System.out.println("홀수의 합은"+odd);
	}

}
