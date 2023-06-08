package s0608;

public class Animal {
	Animal(){
		System.out.println("悼拱 积己");
	}
}

class Dog extends Animal{
	Dog(){
		System.out.println("俺 积己");
	}
}

class Cat extends Animal{
	Cat(){
		System.out.println("绊剧捞 积己");
	}
}

class AnimalMain{
	public static void main(String[] args) {
		System.out.println("test");
		
		Dog d=new Dog();
		Animal a=new Dog();
		Animal b=new Cat();
		Dog c= (Dog)new Animal();
	}
}