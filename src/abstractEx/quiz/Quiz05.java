package abstractEx.quiz;

import java.util.ArrayList;

public class Quiz05 {

	public static void main(String[] args) {

		ArrayList<Animal2> list = new ArrayList<Animal2>();

		list.add(new Human2());
		list.add(new Tiger2());

		for (Animal2 animal2 : list) {
			animal2.sleep();
			if (animal2 instanceof Human2) {
				Human2 human2 = (Human2) animal2;
				human2.move();
				human2.readBook();
			}
			if (animal2 instanceof Tiger2) {
				Tiger2 tiger2 = (Tiger2) animal2;
				tiger2.move();
				tiger2.hunting();
			}
		}
	}

}

// 동물 클래스 (추상 클래스)
abstract class Animal2 {

	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}

	public abstract void move();
}

// 사람 클래스
class Human2 extends Animal2 {

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
class Tiger2 extends Animal2 {

	@Override
	public void move() {
		System.out.println("호랑이 네발");
	}

	public void hunting() {
		System.out.println("호랑이 사냥");
		System.out.println();
	}
}