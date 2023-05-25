package s525;

public class employeemain {

	public static void main(String[] args) {
		emprloyee e1 = new emprloyee();
		e1.setName("이도령");
		e1.setNo(100);
		e1.setAge(25);
		e1.print();
		
		emprloyee e2 = new emprloyee("성춘향",200,18);
		e2.print();
		
		e1.setNo(300);
		System.out.println(e1.getName()+"님이 사번이"+e1.getNo()+"으로 변경됨.");
		e1.print();
		
		e2.setAge(20);
		System.out.println(e1.getName()+"님이 나이가"+e1.getAge()+"으로 변경됨.");
		e2.print();
	}

}
