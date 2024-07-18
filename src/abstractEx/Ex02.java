package abstractEx;

public class Ex02 {

	public static void main(String[] args) {

		Animal animal1 = new Dog();
		Dog dog = new Dog();
		animal1.sound();
		animal1.breathe();
		dog.breathe();
		
		Animal animal2 = new Cat();
		Cat cat = new Cat();
		animal2.sound();
		animal2.breathe();
		cat.breathe();
	}

}

// 동물 클래스
abstract class Animal{
	
	// 공통 기능 일반 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 동물마다 다른 울음소리 추상 메소드
	public abstract void sound();
}

// 고양이 클래스
class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
}

// 강아지 클래스
class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}