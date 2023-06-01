package s525;

public class account {
	String name;
	int no;
	int balance;
	
	account(){
		System.out.println("====계정추가====");
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
		System.out.println(name+"님"+money+"원 입금");
	}
	public void withdraw(int money) {
		if(money>balance)
			System.out.println(name+"님"+money+"원 출금실패-현재잔고:"+balance+"원");
		else {
		balance-=money;
		System.out.println(name+"님"+money+"원 출금");
		}
	}
	public void printInfo() {
		System.out.println("[계좌정보]예금주:"+name+"계좌번호"+no+"현재잔고:"+balance);
	}
	void printmenu() {
		System.out.println("\n작업을 선택하세요\n"+"1입금\n"+"2출금\n"+"3잔고조회\n"+"4종료\n");
	}
}
