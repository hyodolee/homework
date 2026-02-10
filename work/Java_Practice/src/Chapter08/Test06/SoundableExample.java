package Chapter08.Test06;

class Cat implements Soundable{
	@Override
	public String sound() {
		return "야옹";
	}
}

class Dog implements Soundable{

	@Override
	public String sound() {
		return "멍멍";
	}
	
}

public class SoundableExample {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Dog dog1 = new Dog();
		
		printSound(dog1);
		printSound(cat1);
	}
}
