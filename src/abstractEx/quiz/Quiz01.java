package abstractEx.quiz;

public class Quiz01 {

	public static void main(String[] args) {
		
		Sonata sonata = new Sonata("소나타");
		sonata.start();
		sonata.drive();
		sonata.stop();
		sonata.turnmOff();
		
		Avante avante = new Avante("아반떼");
		avante.start();
		avante.drive();
		avante.stop();
		avante.turnmOff();
	}

}

// 자동차 클래스
abstract class Car {
	String name;

	public void start() {
		System.out.println(name + " 시동 ON");
	}

	public void drive() {
		System.out.println(name + " Drive");
	}

	public abstract void stop();

	public abstract void turnmOff();
}

// 아반떼 클래스
class Avante extends Car {

	public Avante(String name) {
		this.name = name;
	}

	@Override
	public void stop() {
		System.out.println(name + " Stop");
	}

	@Override
	public void turnmOff() {
		System.out.println(name + " 시동 OFF");
	}

}

// 소나타 클래스
class Sonata extends Car {

	public Sonata(String name) {
		this.name = name;
	}

	@Override
	public void stop() {
		System.out.println(name + " Stop");
	}

	@Override
	public void turnmOff() {
		System.out.println(name + " 시동 OFF");
		System.out.println();
	}
}