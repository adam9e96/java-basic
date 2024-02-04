package chapter13.test2;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("박승준", "010-1234-5678", "053-123-4567", "test@naver.com");
        System.out.println(person);
        // name='박승준', mobile='010-1234-5678', office='053-123-4567', email='test@naver.com'
        person.setEmail("test@kakao.com");
        person.setMobile("010-5678-1234");
        System.out.println(person);
        // name='박승준', mobile='010-5678-1234', office='053-123-4567', email='test@kakao.com'
    }
}
/*
toString 오버라이딩 하면
객체만 찍어도 결과가 나옴
그냥 찍으면 해쉬코드(주소값)이 나오는데 @Override toString 하면
주소값이 아닌 return 값이 나옴
 */