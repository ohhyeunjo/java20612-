package s525;

public class employeemain {

	public static void main(String[] args) {
		emprloyee e1 = new emprloyee();
		e1.setName("�̵���");
		e1.setNo(100);
		e1.setAge(25);
		e1.print();
		
		emprloyee e2 = new emprloyee("������",200,18);
		e2.print();
		
		e1.setNo(300);
		System.out.println(e1.getName()+"���� �����"+e1.getNo()+"���� �����.");
		e1.print();
		
		e2.setAge(20);
		System.out.println(e1.getName()+"���� ���̰�"+e1.getAge()+"���� �����.");
		e2.print();
	}

}
