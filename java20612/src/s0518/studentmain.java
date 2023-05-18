package s0518;

public class studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student kim=new student();
		student jang=new student();
		kim.setname("김로보");
		jang.setname("장로보");
		student song=new student();
		song.setname("김로보");
		kim.setgrade(2);
		jang.setgrade(3);
		song.setgrade(1);
		kim.print();
		jang.print();
		song.print();
		System.out.println("학생수:"+student.getCount());
	}

}
