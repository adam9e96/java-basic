package test.chapter14;

import java.util.Arrays;
import java.util.Scanner;

public class ContactTest {

    public static void main(String[] args) {
        Contact[] contacts;
        contacts = new Contact[100];
        Scanner scanner = new Scanner(System.in);
//        contacts[0] = new Contact("Kim","010-111-2222","kim@java.com");
//        contacts[1] = new Contact("Park","010-111-3333","park@java.com");
//        contacts[2] = new Contact("Lee","010-111-4444","lee@java.com");

        System.out.println("연락처를 입력하시오(종료 -1)");
        for (int i = 0; i < contacts.length; i++) {
            System.out.print("이름과 전화번호 이메일을 입력하세요: ");
            String inputs = scanner.nextLine();
            if (!inputs.equals("-1")) {
                String[] datas = inputs.split(" ");
                System.out.println(Arrays.toString(datas));
                contacts[i] = new Contact(datas[0], datas[1], datas[2]);
                Contact.count++;
            } else {
//                Contact.count +=3;
                System.out.println("지인들의 수는 " + Contact.count + "명 입니다.");
                break;
            }

        }
        System.out.print("검색할 이름을 입력하세요:");
        String findName = scanner.nextLine();

//        for (int i = 0; i < Contact.count; i++) {
//            if (findName.equals(contacts[i].getName())){
//            System.out.println(contacts[i].getName() + "의 전화번호: " + contacts[i].getTel()
//                    + " 이메일 : " + contacts[i].getEmail());
//            }
//        }

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (findName.equals(contacts[i].getName())) {
                    System.out.println(contacts[i].getName() + "의 전화번호: " + contacts[i].getTel()
                            + " 이메일 : " + contacts[i].getEmail());
                }
            } else {
                break;
            }
        }


        scanner.close();
    }
}

