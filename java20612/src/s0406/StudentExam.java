package s0406;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		Student lee = new Student();
		
		kim.name="������";
		kim.numder=20612;
		kim.phone="01083431634";
		kim.School="��ȭ���б�";
		
		System.out.println("�̸�:"+kim.name);
		System.out.println("�й�:"+kim.numder);
		System.out.println("��ȭ��ȣ:"+kim.phone);
		System.out.println("�б��̸�:"+kim.School);
		
		lee.name="�ȵ���";
		lee.numder=20612;
		lee.phone="01031614816";
		
		System.out.println("�̸�:"+lee.name);
		System.out.println("�й�:"+lee.numder);
		System.out.println("��ȭ��ȣ:"+lee.phone);
		System.out.println("�б��̸�:"+lee.School);
		System.out.println("���л���:"+Student.count);
	}

}
