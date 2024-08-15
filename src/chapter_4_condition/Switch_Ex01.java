package chapter_4_condition;
/**
 * ===========================================================
 * fileName       : Switch_Ex01
 * date           : 2024-02-04
 * description    : 스위치문_예제_01
 * ===========================================================
 */
public class Switch_Ex01 {

	public static void main(String[] args) {
		// 일년 동안 읽은 책 수에 따라 멘트를 출력합니다.
		int book = 15;

		switch (book / 10) {
		case 0: // 10권 미만
			System.out.println("조금 더 노력 하세요!");
			break;
		case 1: // 10권 이상
			System.out.println("책 읽는 것을 즐기는 분이시네요!");
			break;
		case 2: // 20권 이상
			System.out.println("책을 사랑하는 분이시네요!");
			break;
		default: // 30권 이상
			System.out.println("당신은 다독왕입니다!");
			break; // default 문에서는 break 생략 가능
		}
	}
}
