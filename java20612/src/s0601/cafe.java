package s0601;

public class cafe {
	int coffee;
	int suger;
	int cream;
	void makeTea() {
		printTeaInfo();
	}
	void makeTea(int coffee) {
		this.coffee=coffee;
		makeTea();
	}
	void makeTea(int coffee, int suger) {
		this.suger=suger;
		makeTea(coffee);
	}
	void makeTea(int coffee, int suger, int cream) {
		this.cream=cream;
		makeTea(coffee, suger);
	}
	
	void printTeaInfo() {
		System.out.println("----[���]----");
		if (cream!=0 && suger!=0) {
			System.out.println("��ũĿ�� ������~~");
			System.out.println("Ŀ��:"+coffee);
			System.out.println("����:"+suger);
			System.out.println("ũ��:"+cream);
			System.out.println("Ŀ�� ��:"+(coffee+suger+cream));
		}
		else if (suger!=0){
			System.out.println("����Ŀ�� ������~~");
			System.out.println("Ŀ��:"+coffee);
			System.out.println("����:"+suger);
			System.out.println("Ŀ�� ��:"+(coffee+suger));
		}
		else {
			System.out.println("��Ŀ�� ������~~");
			System.out.println("Ŀ��:"+coffee);
			System.out.println("Ŀ�� ��:"+coffee);
		}
	}
}
