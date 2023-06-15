package s0615;

public class BookMain2 {

	public static void main(String[] args) {
		cartoon c1=new cartoon();
		major m1=new major();
		c1.title = "순정만화";
		c1.writer="강풀";
		c1.webtoon=true;
		c1.printBook();
		m1.title="자바의정석";
		m1.writer="남긍성";
		m1.Subject="프로그래밍";
		m1.printBook();
	}

}
