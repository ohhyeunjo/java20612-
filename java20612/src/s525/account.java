package s525;

public class account {
	String name;
	int no;
	int balance;
	
	account(){
		System.out.println("====�����߰�====");
	}
	account(String name, int no){
		this.name=name;
		this.no=no;
	}
	account(String name, int no,int balance){
		this(name, no);
		this.balance=balance;
	}
	String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		 this.no=no;
	}
	public void setName(String name) {
		 this.name=name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int age) {
		 this.balance=age;
	}
	public void deposit(int money) {
		balance+=money;
		System.out.println(name+"��"+money+"�� �Ա�");
	}
	public void withdraw(int money) {
		if(money>balance)
			System.out.println(name+"��"+money+"�� ��ݽ���-�����ܰ�:"+balance+"��");
		else {
		balance-=money;
		System.out.println(name+"��"+money+"�� ���");
		}
	}
	public void printInfo() {
		System.out.println("[��������]������:"+name+"���¹�ȣ"+no+"�����ܰ�:"+balance);
	}
	void printmenu() {
		System.out.println("\n�۾��� �����ϼ���\n"+"1�Ա�\n"+"2���\n"+"3�ܰ���ȸ\n"+"4����\n");
	}
}
