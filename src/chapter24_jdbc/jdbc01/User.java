package chapter24_jdbc.jdbc01;

/**
 * 시스템 내의 사용자를 나타내는 클래스입니다.
 * 이 클래스는 간단한 데이터 모델로, 사용자 정보를 저장하고 관리하는 데 사용됩니다.
 *
 * <p>주로 데이터베이스 작업과 관련된 애플리케이션 내에서 사용자 데이터를 저장하는 데 사용됩니다.</p>
 *
 * @author      [작성자 이름]
 * @version     1.0
 * @since       2024-02-14
 */
public class User {

    /**
     * 사용자의 고유 식별자입니다.
     */
    public String userID;

    /**
     * 사용자의 이름입니다.
     */
    public String name;

    /**
     * 사용자의 나이입니다.
     */
    public int age;

    /**
     * 사용자의 직업 또는 직무입니다.
     */
    public String job;

    // 기본 생성자, getter, setter, 기타 메소드는 여기에 추가할 수 있습니다.
}
