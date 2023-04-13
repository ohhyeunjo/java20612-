package s0406;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		Student lee = new Student();
		
		kim.name="오현조";
		kim.numder=20612;
		kim.phone="01083431634";
		kim.School="교화중학교";
		
		System.out.println("이름:"+kim.name);
		System.out.println("학번:"+kim.numder);
		System.out.println("전화번호:"+kim.phone);
		System.out.println("학교이름:"+kim.School);
		
		lee.name="안도근";
		lee.numder=20612;
		lee.phone="01031614816";
		
		System.out.println("이름:"+lee.name);
		System.out.println("학번:"+lee.numder);
		System.out.println("전화번호:"+lee.phone);
		System.out.println("학교이름:"+lee.School);
		System.out.println("총학생수:"+Student.count);
	}

}
