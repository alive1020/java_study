package ch05.sec05;

public class IndexOfCotainExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		//해당 문자열이 시작하는 인덱스 번호를 리턴한다.
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		String substring = subject.substring(location);
		System.out.println(substring);
		
		//2.해당 문자열이 있는지 찾아오는 기능
		location = subject.indexOf("자바"); //0 없는값을 찾으면 -1
		if(location == -1) {
			System.out.println("해당 문자열이 없습니다.");
		} else {
			System.out.println("해당 문자열이 존재합니다.");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("해당 문자열이 존재합니다");
		} else {
			System.out.println("해당 문자열이 없습니다");
		}
	}

}
