package s0713;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.println("1.3��° ���ڸ� ����ϼ���:"+str.charAt(2));
		System.out.println("2.str�� ABC�� ���ϼ���:"+str.compareTo("abc"));
		System.out.println("3.str�� mno�� �����Ѱ�?:"+str.contains("mno"));
		System.out.println("4.str�� ����ִ°�?:"+str.isEmpty());
		System.out.println("5.str�� ���̴�?:"+str.length());
		System.out.println("6.abc�� ABC�� �ٲٽÿ�:"+str.replace("abc", "ABC"));
		System.out.println("7.str���� cde�� ����:"+str.substring(2, 5));
		System.out.println("8.str�� �빮�ڷ� �ٲٱ�:"+str.toUpperCase());
		
		String a = "123";
		
		System.out.println(Integer.parseInt(a)+1);
		
		Integer i = 123;
		System.out.println(i.doubleValue());
		
		System.out.println(Integer.parseInt(a));
		int j = -555;
		System.out.println(Math.abs(j));
		System.out.println(Math.max(345, 356));
		for(int k=0; k<5; k++)
			System.out.println(Math.round(Math.random()*100));
	}

}
