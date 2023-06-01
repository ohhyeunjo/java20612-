package s525;

public class studentmain {

	public static void main(String[] args) {
		student kim=new student();
		kim.name="±è·Îº¿";
		kim.grade=1;
		
		student lee=new student("ÀÌ·Îº¿");
		lee.grade=2;
		
		student park=new student("¹Ú·Îº¿", 3);
		
		kim.print();
		lee.print();
		park.print();
		
	}

}
