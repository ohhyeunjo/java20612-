package s0615;

public class BookMain {

	public static void main(String[] args) {
		System.out.println(Book.getLibrary()+"�� ���絵����"+Book.getBookCnt()+"�Դϴ�");
		System.out.println("*******************************************************");
		Book could=new Book(100,"������");
		could.setCount(10);
		Book watermelon=new Book(101,"���ڼ�����");
		watermelon.setCount(5);
		Book dog=new Book(102,"��������",15,0);
		could.printInfo();
		watermelon.printInfo();
		dog.printInfo();
		System.out.println("*******************************************************");
		System.out.println(Book.getLibrary()+"�� ���絵����"+Book.getBookCnt()+"�Դϴ�");
		System.out.println("*******************************************************");
		could.borrowBook(15);
		watermelon.returnBook(2);
		could.borrowBook(5);
		dog.borrowBook(10);
		dog.returnBook(5);
		System.out.println("*******************************************************");
		could.printInfo();
		watermelon.printInfo();
		dog.printInfo();
	}

}
