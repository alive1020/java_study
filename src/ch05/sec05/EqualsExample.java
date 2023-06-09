package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		//기본타입은 값 참조타입은 주소
		// strVar1과 strVar2는 같은 주소를 가지고있따.
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		//주소를 비교
		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 같은 주소를 참조");

		} else {
			System.out.println("strVar1과 strVar2는 다른 주소를 참조");
		}
		
		
		//값 자체를 비교함 홍길동(리터럴)이 들었는지
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 값이 같다");
		} 
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 같은 주소를 참조");

		} else {
			System.out.println("strVar3과 strVar4는 다른 주소를 참조");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 값이 같다");
		} 
		
		//빈문자열도 똑같이 equals를 사용한다.
		String hobby = "";
		if(hobby.equals("")) {
			System.out.println("hobby변수가 참조하는 건 빈문자열");
		}
	}
	

}
