package s0601;

public class enghello extends greeting {

	public String name="Mr hong";
	void sayHello() {
		System.out.println(name+" nice to meet you");
	}
	void �ȳ��ϼ���() {
		super.sayHello();
	}
	public static void main(String[] args) {
		enghello eng = new enghello();
		eng.sayHello();
		eng.�ȳ��ϼ���();
	}

}
