package s0615;

public class Book2 {
	String title;
	String writer;
	void printBook() {
		System.out.println("������:"+title+"�۰�:"+writer);
	}
}

class cartoon extends Book2{
	boolean webtoon;

	@Override
	void printBook() {
		// TODO Auto-generated method stub
		super.printBook();
		if(webtoon) {
			System.out.println("�� ��ȭ�� ����");
		}else {
			System.out.println("���� �ƴ�");
		}
	}
	
}

class major extends Book2{
	String Subject;

	@Override
	void printBook() {
		// TODO Auto-generated method stub
		super.printBook();
		System.out.println("�� å�� �оߴ�"+Subject);
	}
	
}
