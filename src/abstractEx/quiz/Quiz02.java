package abstractEx.quiz;

public class Quiz02 {

	public static void main(String[] args) {

		Bus bus = new Bus();
		bus.run();
		bus.refuel();
		bus.takePassenger();

		AutoCar autoCar = new AutoCar();
		autoCar.run();
		autoCar.refuel();
		autoCar.load();

	}

}

// 자동차 클래스
abstract class Car1 {

	public abstract void run();

	public abstract void refuel();
}

// 버스 클래스
class Bus extends Car1 {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("천연 가스 충전");
	}

	public void takePassenger() {
		System.out.println("승객을 태웁니다.");
		System.out.println();
	}
}

// 오토카 클래스
class AutoCar extends Car1 {

	@Override
	public void run() {
		System.out.println("자동차가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("휘발류 주유");
	}

	public void load() {
		System.out.println("짐을 싣습니다.");
		System.out.println();
	}
}