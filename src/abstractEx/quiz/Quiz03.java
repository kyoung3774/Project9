package abstractEx.quiz;

public class Quiz03 {

	public static void main(String[] args) {
		
		Human human = new Human();
		human.sleep();
		human.move();
		human.readBook();
		
		Tiger tiger = new Tiger();
		tiger.sleep();
		tiger.move();
		tiger.hunting();
	}

}

// 동물 클래스
abstract class Animal{
	
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}
	
	public abstract void move();
}

// 사람 클래스
class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람 두발");
	}
	
	public void readBook() {
		System.out.println("사람 책");
		System.out.println();
	}
	
}

// 호랑이 클래스
class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이 네발");
	}
	
	public void hunting() {
		System.out.println("호랑이 사냥");
		System.out.println();
	}
}