package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		//인스턴스 = new로 생성한 자동차(객체)
		Car myCar = new Car();
		
		//필드에 접근 = 인스턴스명(myCar).필드명
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		//필드 값 변경 => 인스턴스명.필드명
		myCar.speed = 60;
		System.out.println("수정된 myCar속도: " + myCar.speed);
		System.out.println(myCar);
		System.out.println("===========================");
		
		Car myCar2 = new Car();
		myCar2.speed = 70;
		System.out.println("myCar2 속도: " + myCar2.speed);
		System.out.println("myCar2 제작회사: " + myCar2.company);
		System.out.println("===========================");
		
		Car myCar3 = new Car();
		myCar3.speed = 90;
		System.out.println("myCar3 속도: " + myCar3.speed);
		System.out.println("myCar3 제작회사: " + myCar3.company);
		
	}

}
