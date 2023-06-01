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
		System.out.println("----[계산]----");
		if (cream!=0 && suger!=0) {
			System.out.println("밀크커피 나가요~~");
			System.out.println("커피:"+coffee);
			System.out.println("설탕:"+suger);
			System.out.println("크림:"+cream);
			System.out.println("커피 농도:"+(coffee+suger+cream));
		}
		else if (suger!=0){
			System.out.println("설탕커피 나가요~~");
			System.out.println("커피:"+coffee);
			System.out.println("설탕:"+suger);
			System.out.println("커피 농도:"+(coffee+suger));
		}
		else {
			System.out.println("블랙커피 나가요~~");
			System.out.println("커피:"+coffee);
			System.out.println("커피 농도:"+coffee);
		}
	}
}
