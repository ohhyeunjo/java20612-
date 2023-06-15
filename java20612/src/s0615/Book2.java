package s0615;

public class Book2 {
	String title;
	String writer;
	void printBook() {
		System.out.println("도서명:"+title+"작가:"+writer);
	}
}

class cartoon extends Book2{
	boolean webtoon;

	@Override
	void printBook() {
		// TODO Auto-generated method stub
		super.printBook();
		if(webtoon) {
			System.out.println("이 만화는 웹툰");
		}else {
			System.out.println("웹툰 아님");
		}
	}
	
}

class major extends Book2{
	String Subject;

	@Override
	void printBook() {
		// TODO Auto-generated method stub
		super.printBook();
		System.out.println("이 책의 분야는"+Subject);
	}
	
}
