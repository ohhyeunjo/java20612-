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
			System.out.println(car_name+"이가 운행 중입니다");
		}
		void stop() {
			running=false;
			System.out.println(car_name+"이가 정차 하였습니다");
		}
		void vel_up(int value) {
			if(!running) {
				System.out.println(car_name+"정차중");
				return;
			}
			
			
			velocity+=value;
			if (velocity>=100) {
				velocity=100;
				System.out.println("최대 속도는 100입니다");
			}
				System.out.println(car_name+"의 현재 속도는"+velocity+"입니다");
		}
		void vel_down(int value) {
			if(!running) {
				System.out.println(car_name+"정차중");
				return;}
			
			velocity-=value;
			if (velocity<0); {
				velocity=0;
				System.out.println("최소 속도는 0입니다");
			}
			System.out.println(car_name+"의 현재 속도는"+velocity+"입니다");
		}
}
