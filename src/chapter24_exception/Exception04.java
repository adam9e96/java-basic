package chapter24_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ===========================================================
 * fileName       : Exception04
 * date           : 2024-02-02
 * description    : try-with-resource 로 변환 (03자바파일)
 * 자동으로 close() 해주고 코드가 짧아짐 finally를 안써도됨
 * 반대로 try-with-resource를 안쓴다면 finally를 써서 닫아주도록 해야됨.
 * ===========================================================
 */
public class Exception04 {
    public static void main(String[] args) {
        String path = ".\\sample_file\\test.txt";    // 이스케이프 문자 \ 를 사용하여 \\로 나타냄 . .점은 현재위치임

        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            System.out.println("지정한 경로에 파일이 존재합니다.");   // 실행 안됨    // 만약 파일이 있따면 실행됨
        } catch (FileNotFoundException e) {
            System.out.println("지정한 경로에 파일이 존재하지 않습니다.");   // 실행됨
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
