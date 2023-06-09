/*1. 상속이 들어간 프로그램 만들기, 주제 자유
2. 자식 클래스는 3개 이상
3. 다형성 사용하기(오버라이드, 자동타입 변환)
4. 메인 메소드에서 사용하는 기능은 4개 이상
5. arrayList 혹은 array 사용
6. 은행 금지(같이했던 기능[계좌] 아니면 가능),
   Customer금지(같이했던 기능[보너스포인트,할인] 아니면 가능)*/

package game.project;

import java.util.ArrayList;

public class HumanExample {

	private static ArrayList<Human> humanList = new ArrayList<Human>();

	public static void main(String[] args) {
		Human Human1 = new Warrior("홍길동", 1000, "전사");
		Human Human2 = new Archer("이길동", 1001, "궁수");
		Human Human3 = new Archer("김길동", 1002, "궁수");
		Human Human4 = new Thief("박길동", 1003, "도적");
		Human Human5 = new Wizard("최길동", 1004, "마법사");

		humanList.add(Human1);
		humanList.add(Human2);
		humanList.add(Human3);
		humanList.add(Human4);
		humanList.add(Human5);
		

		// Human human = findHuman(1000);
		Human human = findHuman(1004);
		Human human2 = findHuman(1001);
		
		

		if (human == null) {

			System.out.println("존재하지 않는 사람");
		} else {

			status(human, 20);
			
			System.out.println();
			
			typeUpgrade(human);
			
			System.out.println();
			
			upgrade(human, 20);
			
			System.out.println();
			
			hunt(human);

		}
		System.out.println();
		pvp(human, human2);
	}

	public static Human findHuman(int humanID) {
		Human resultHuman = null;
		for (Human human : humanList) {

			if (human.getHumanID() == humanID) {
				resultHuman = human;
				break;
			}
		}

		return resultHuman;
	}
	
	

	public static void status(Human human, int num) {
		System.out.println("현재 아이디:" + human.getHumanID());
		System.out.println();
		int str = human.powerUp(num); // 타입에 따른 기본공격력
		System.out.println("타입:" + human.getTypeName() + " " + "기본공격력:" + str);

	}

	public static void upgrade(Human human, int num) {
		System.out.println("강화");
		int str = human.powerUp(num * 2);
		System.out.println("성공!" + " " + "강화된 공격력:" + str);

	}

	public static void typeUpgrade(Human human) {

		int str = human.overpower;// 기본 공격력

		if (str > 300) {
			System.out.println("전직이 가능합니다");
		} else {
			System.out.println("전직을 위한 공격력이 부족합니다");
		}

	}

	public static void hunt(Human human) {
		int str = human.overpower; // 강화된 공격력
		int dragon = 800;

		if (str > dragon) {
			System.out.println("드래곤 사냥이 가능합니다.");
		} else {
			System.out.println("드래곤 사냥이 불가능합니다.");
		}

	}
	
	public static void pvp(Human human , Human human2) {
		human2.powerUp(20);
		human.powerUp(20);
		System.out.println("=====결투=====");
		System.out.println();
		if(human.overpower > human2.overpower) {
			System.out.println("승자:" + human.getHumanName() +" "+ "타입:" + human.getTypeName());
		} else if(human.overpower < human2.overpower) {
			System.out.println("승자:" + human2.getHumanName() +" "+ "타입:" + human2.getTypeName());
		} else {
			System.out.println("무승부");
		}
	}

}
