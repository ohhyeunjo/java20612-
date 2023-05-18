package s0518;

public class Exam01sub {
	String name ;
	final private int price = 1000;
	int count;
	static int total_count;
	
	Exam01sub(String name1, int count1){
		name=name1;
		count=count1;
		total_count+=count;
	}
		
	
	
	void printFood() {
		System.out.println(name + price + "¿ø*" + count + "°³");
		System.out.println("ÃÑ ¼ö·®:"+total_count);
	}
	
	int getPrice() {
		return price;
	}
	void setPrice(int price1) {
		//price = price1;
	}
}