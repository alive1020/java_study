package ch08.sec07;

public interface Service {
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속코드");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속코드");
		defaultCommon();
	}
	
	//private 메소드  => 사용할때 구현 객체가 필요하다.
	private void defaultCommon() {
		System.out.println("defaultMethod 종속코드A");
		System.out.println("defaultMethod 종속코드B");
	}
	
	static void staticMethod1() {
		System.out.println("staticMethod1 종속코드");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 종속코드");
		staticCommon();
	}
	
	private static void staticCommon() {
		System.out.println("staticMethod 종속코드C");
		System.out.println("staticMethod 종속코드D");
	}
}
