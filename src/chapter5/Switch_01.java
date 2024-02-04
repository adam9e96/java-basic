package chapter5;

public class Switch_01 {

	public static void main(String[] args) {

		String medal = "Gold";
		String medal2 = "Silver";
//		switch (medal2) {
//		case "Gold":
//			System.out.println("금메달 입니다.");
//			break;
//		case "Silver":
//			System.out.println("은메달 입니다.");
//			break;
//		case "Bronze":
//			System.out.println("동메달 입니다.");
//			break;
//		default:
//			System.out.println("메달이 없습니다.");
//			break;
//		}
		switch (medal) {
		case "Gold":
			System.out.println("금메달 입니다.");
			break;
		case "Silver":
			System.out.println("은메달 입니다.");
			break;
		case "Bronze":
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}

		System.out.println("==============================");

		if (medal2.equals("Gold")) {
			System.out.println("금메달입니다.");
		} else if (medal2.equals("Silver")) {
			System.out.println("은메달 입니다.");
		} else if (medal2.equals("Bronze")) {
			System.out.println("동메달 입니다.");
		} else {
			System.out.println("메달이 없습니다.");
		}
		/*
		 * switch 문은 if else if 문으로 변경이 가능하다. 문자열은 equals() 메소드를 이용한다.
		 */
	}
}
