package s0629;

public class shipMain extends ship{
	String shipname;
	int p_count;
	int l_amount;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shipMain s1 = new shipMain();
		s1.l_amount = 100;
		s1.p_count = 200;
		
		System.out.println("�ִ� �°���" + s1.p_count + "�Դϴ�");
		System.out.println("�ִ� ���緮��"+s1.l_amount+"�Դϴ�");
	}

	@Override
	int Passenger() {
		// TODO Auto-generated method stub
		return p_count;
	}

	@Override
	int Luggage() {
		// TODO Auto-generated method stub
		return l_amount;
	}

}
