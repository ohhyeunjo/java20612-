package s0413;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------1��------");
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j <= 4; j++)
				System.out.print(j);
			System.out.println();
		}

		System.out.println("------2��------");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 3; j++)
				System.out.print(i);
			System.out.println();
		}

		System.out.println("------3��------");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}

		System.out.println("------4��------");
		for (int i =3; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

		System.out.println("------5��------");
		for (int i = 3; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}

		System.out.println("------6��------");
		for (int i = 1; i < 4; i++) {
			for (int j = 3; j >= i; j--)
				System.out.print(i);
			System.out.println();
		}
	}
}
