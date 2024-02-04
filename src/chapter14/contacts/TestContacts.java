package chapter14.contacts;

import java.util.Arrays;
import java.util.Scanner;

/*

지인들의 연락처 (최대 100)을 저장하고 검색하는 프로그램을 객체 배열을 이용하여 작성.
    1) Contacts 클래스는  이름 name, 전화번호 tel, 이메일 email 등의 필드를 가짐.
    여기에 지인들의 수를 저장하는 정적변수 count를 추가.

    2) TestContacts 클래스의 main() 메서드에서 Contacts 객체를 저장하는 객체 배열을 생성.
    *
    * 이프로그램은 다음과 같은 사용자 인터페이스를 가짐
    *
    *
    연락처를 입력하시오(종료 -1)
    이름과 전화번호 이메일을 입력하세요: Kim 010-111-2222 kim@java.com
    이름과 전화번호 이메일을 입력하세요: Park 010-111-3333 park@java.com
    이름과 전화번호 이메일을 입력하세요: Lee 010-111-4444 lee@java.com
    이름과 전화번호 이메일을 입력하세요: -1
    지인들의 수는 3명입니다.
    검색할 이름을 입력하시오: Park
    Park의 전화번호: 010-111-3333 이메일 : park@java.com

    * 입력시 데이터는 공백으로 구분해서 입력
    String[] datas = inputs.split(" ");split 메서드를 이용해서 배열 처리.
*

 */
public class TestContacts {
    public static void main(String[] args) {
        Contacts[] contacts;
        contacts = new Contacts[100];
        Scanner scanner = new Scanner(System.in);

//        contacts[0] = new Contacts("Kim","010-111-2222","kim@java.com");
//        contacts[1] = new Contacts("Park","010-111-3333","park@java.com");
//        contacts[2] = new Contacts("Lee","010-111-4444","lee@java.com");

        System.out.println("연락처를 입력하시오(종료-1)");
        for (int i = 0; i < contacts.length; i++) {
            System.out.println("이름과 전화번호 이메일을 입력하세요: ");
            String inputs = scanner.nextLine();
            if (!inputs.equals("-1")) {
                String[] datas = inputs.split(" ");
                System.out.println(Arrays.toString(datas)); // 입력데이터가 배열로 변경이 잘 되었는지 확인
                contacts[i] = new Contacts(datas[0], datas[1], datas[2]);
                System.out.println(contacts[i]); // 해쉬코드 보기
                Contacts.count++;
            } else {
//                Contacts.count += 3;
                System.out.println("지인들의 수는" + Contacts.count + "명입니다.");
                break;
            }
        }

        System.out.print("검색할 이름을 입력하세요 : ");
        String findName = scanner.nextLine();


//         같은 이름이 여러명 있을 수 있다는 가정
//         case1
//        for (int i = 0; i < contacts.length; i++) {
//            if (findName.equals(contacts[i].getName())) {
//                System.out.println(contacts[i].getName() + "의 전화번호: " + contacts[i].getTel()
//                        + " 이메일 : " + contacts[i].getEmail());
//            }
////         null.getName() 이나 다름없다. 인덱스 2번 이후 3번방부터는 아무것도 없는데 명령을 시켜서 에러가 뜨는거다.
//        }


        // case2. 반복문의 끝까지 순회. 데이터는 3개 인데 100번 반복
//        for (int i = 0; i < contacts.length; i++) {
//            if (contacts[i] != null && findName.equals(contacts[i].getName())) {
//                System.out.println(contacts[i].getName() + "의 전화번호: " + contacts[i].getTel()
//                        + " 이메일 : " + contacts[i].getEmail());
//            }
//        }

        // case2.의 && AB 위치만 바꿔보기. 에러뜸
//        for (int i = 0; i < contacts.length; i++) {
//            if (findName.equals(contacts[i].getName()) && contacts[i] != null) {
//                System.out.println(contacts[i].getName() + "의 전화번호: " + contacts[i].getTel()
//                        + " 이메일 : " + contacts[i].getEmail());
//            }// A && B 문장에서 컴퓨터는 A 부터 검사를 하는데 순서를 바꿔서 하면 에러뜨는거부터 하기때문
//        } // 배열에선 && 연산의 순서도 중요하다. 검사를어떻게 하냐에 따라 널 포인트 예외가 발생할 수 있기 때문.


        // case 3. 완성직전. // 저장된 데이터 개수보다 1번 더 반복함.
        // 데이터가 3개 있다면 4번 실행됨.
//        for (int i = 0; i < contacts.length; i++) {
//            if (contacts[i] != null) {
//                if (findName.equals(contacts[i].getName())) {
//                    System.out.println(contacts[i].getName() + "의 전화번호: " + contacts[i].getTel()
//                            + " 이메일 : " + contacts[i].getEmail());
//                }
//            } else {
//                break;
//            }
//        }
        // 완성.
        // count로 하면 null 이 없는것만 조회하므로 데이터 개수 = 반복문 횟수 동일하게 실행된다
        // 3번 실행됨.
        for (int i = 0; i < Contacts.count; i++) {
            if (findName.equals(contacts[i].getName())) {
                System.out.println(contacts[i].getName() + "의 전화번호: " + contacts[i].getTel()
                        + " 이메일 : " + contacts[i].getEmail());
            }
        }
        scanner.close();
    }
}

/*
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "chapter14.contacts.Contacts.getName()" because "contacts[i]" is null
	at chapter14.contacts.TestContacts.main(TestContacts.java:59)
 */
/*
아래에서부터 좋은 코드 순이다.
 */