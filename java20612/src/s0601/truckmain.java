package s0601;

public class truckmain {
	
	public static void main(String[] args) {
		truck mytruck = new truck();
		mytruck.setname("프론티어");
		mytruck.ton=3;
		mytruck.color="RED";
		
		mytruck.speedUp();
		mytruck.speedUp();
		mytruck.speedUp();
	}
}
