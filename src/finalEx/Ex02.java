package finalEx;

class Parents {
	
	// final method는 재정의 불가능
	final void method1() {

	}

	void method2() {

	}

}

class Child extends Parents {

	@Override
	void method2() {
		
	}
	
	
}