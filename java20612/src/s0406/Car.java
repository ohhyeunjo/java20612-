package s0406;

public class Car {
		String car_name;
		int price;
		String brand;
		static int count=0;
		int velocity=0;
		boolean running=false;
		Car(){
			count++;
		}
		void run() {
			running=true;
			System.out.println(car_name+"�̰� ���� ���Դϴ�");
		}
		void stop() {
			running=false;
			System.out.println(car_name+"�̰� ���� �Ͽ����ϴ�");
		}
		void vel_up(int value) {
			if(!running) {
				System.out.println(car_name+"������");
				return;
			}
			
			
			velocity+=value;
			if (velocity>=100) {
				velocity=100;
				System.out.println("�ִ� �ӵ��� 100�Դϴ�");
			}
				System.out.println(car_name+"�� ���� �ӵ���"+velocity+"�Դϴ�");
		}
		void vel_down(int value) {
			if(!running) {
				System.out.println(car_name+"������");
				return;}
			
			velocity-=value;
			if (velocity<0); {
				velocity=0;
				System.out.println("�ּ� �ӵ��� 0�Դϴ�");
			}
			System.out.println(car_name+"�� ���� �ӵ���"+velocity+"�Դϴ�");
		}
}
