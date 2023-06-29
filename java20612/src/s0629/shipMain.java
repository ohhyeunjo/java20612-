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
		
		System.out.println("최대 승객은" + s1.p_count + "입니다");
		System.out.println("최대 적재량은"+s1.l_amount+"입니다");
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
