package chapter_23_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * description    : try-with-resource 로 변환
 * 자동으로 close() 해주고 코드가 짧아짐 finally를 안써도됨
 * 반대로 try-with-resource를 안쓴다면 finally를 써서 닫아주도록 해야됨.
 *
 * @since 2024.07.31
 */
public class Exception_06 {
    public static void main(String[] args) {
        String path = ".\\sample_file\\test.txt"; // 파일 경로 지정

        // try-with-resources 구문
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            System.out.println("지정한 경로에 파일이 존재합니다."); // 파일이 존재하면 실행
        } catch (FileNotFoundException e) {
            System.out.println("지정한 경로에 파일이 존재하지 않습니다."); // 파일이 존재하지 않으면 실행
        } catch (IOException e) {
            throw new RuntimeException("파일을 닫는 동안 오류가 발생했습니다.", e); // 파일을 닫는 동안 예외 발생 시 런타임 예외 발생
        }
        /*
         * try-with-resources의 장점
         * 자동 자원 해제: try-with-resources 구문은 AutoCloseable 인터페이스를 구현한 리소스를 자동으로 닫아줍니다. 이를 통해 자원을 수동으로 해제할 필요가 없습니다.
         * 간결한 코드: 자원을 해제하는 코드를 명시적으로 작성할 필요가 없으므로 코드가 간결해집니다.
         * 예외 처리: 자원 해제 중 발생할 수 있는 예외도 처리할 수 있습니다.
         */
    }
}
