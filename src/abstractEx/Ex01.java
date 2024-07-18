package abstractEx;

public class Ex01 {

	public static void main(String[] args) {
		
		// 추상 클래스는 인스터스화 불가능(추상 클래스의 목적은 상속)
//		Computer computer = new Computer();
		
		DeskTop deskTop = new DeskTop();
		NoteBook noteBook = new NoteBook();
		
		deskTop.turnOn();
		deskTop.turnOff();
		deskTop.display();
		deskTop.typing();
		System.out.println();
		
		noteBook.turnOn();
		noteBook.turnOff();
		noteBook.display();
		noteBook.typing();
		
		
	}

}

// 컴퓨터 클래스
abstract class Computer {

	// 자식 클래스가 공통으로 사용하는 일반 메소드
	public void turnOn() {
		System.out.println("전원 ON");
	}

	public void turnOff() {
		System.out.println("전원 OFF");
	}

	// 자식 클래스마다 다르게 사용하는 추상 메소드
	public abstract void display();

	public abstract void typing();
}

// 데스크탑 클래스
class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTop Display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");
	}
}

// 노트북 클래스
class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook Display()");
	}

	@Override
	public void typing() {
		System.out.println("NoteBook Typing()");
	}

}