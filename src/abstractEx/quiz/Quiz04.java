package abstractEx.quiz;

import java.util.ArrayList;

public class Quiz04 {

	public static void main(String[] args) {

		ArrayList<Car2> list = new ArrayList<Car2>();

		list.add(new Bus2());
		list.add(new AutoCar2());
		
		// 일반 for문 
		for (int i = 0; i < list.size(); i++) {
			Car2 car2 = list.get(i);
			
			car2.run();
			car2.refuel();
			
			if (car2 instanceof Bus2) {
				Bus2 bus2 = (Bus2) car2;
				bus2.takePassenger();
			}
			if (car2 instanceof AutoCar2) {
				AutoCar2 autoCar2 = (AutoCar2) car2;
				autoCar2.load();
			}
		}
		
		// for each문
		for (Car2 car2 : list) {
			car2.run();
			car2.refuel();
			if (car2 instanceof Bus2) {
				Bus2 bus2 = (Bus2) car2;
				bus2.takePassenger();
			}
			if (car2 instanceof AutoCar2) {
				AutoCar2 autoCar2 = (AutoCar2) car2;
				autoCar2.load();
			}
		}
	}

}

//자동차 클래스
abstract class Car2 {

	public abstract void run();

	public abstract void refuel();
}

//버스 클래스
class Bus2 extends Car2 {

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

//오토카 클래스
class AutoCar2 extends Car2 {

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