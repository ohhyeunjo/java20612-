package s525;

public class circle {
	double radius;
	final double PI= 3.14;
	
	circle() {
	}
		circle(double radius){
			this.radius=radius;
		}
	double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
	double computeArea() {
		return radius*radius*PI;
	}
	double computePerimeter() {
		return radius*PI*2;
	}
	void print() {
		System.out.println("반지름"+getRadius()
		+"원의 면적"+computeArea()
		+"원의 둘레"+computePerimeter());
	}
}
