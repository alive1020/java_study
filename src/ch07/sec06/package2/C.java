package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class C {
	public void method() {
		//클래스가 다른패키지에 있으면 접근 불가능
		A a = new A();
		a.field = "value";
		a.method();
	}
}
