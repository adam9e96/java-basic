package chapter_23_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * DB랑 작업할때 많이 사용하는 try/catch 패턴임
 *
 * @since 2024.07.31
 */
public class Exception_05 {
    /**
     * 예외 처리를 시연하는 메인 메서드
     * 파일 입력 스트림을 열고, 파일이 존재하지 않을 경우 예외를 처리하며,
     * 파일이 열렸을 경우에는 반드시 닫아주는 패턴을 시연
     *
     * @param args 명령줄 인수
     */
    public static void main(String[] args) {
        // finally를 사용하는 예. 디비나 파일의 경우 사용 후에는 닫아줘야 함 (close() 실행)
        String path = ".\\sample_file\\test.txt";    // 파일 경로 지정
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(path);    // 파일 입력 스트림 열기 (예외 발생 가능)
            System.out.println("지정한 경로에 파일이 존재합니다.");   // 파일이 존재하면 실행
        } catch (FileNotFoundException e) {
            System.out.println("지정한 경로에 파일이 존재하지 않습니다.");   // 파일이 존재하지 않으면 실행
        } finally {   // 예외 발생 여부와 상관없이 실행
            if (fileInputStream != null) {  // 파일이 정상적으로 열렸다면
                try {
                    fileInputStream.close();  // 파일 입력 스트림 닫기
                } catch (IOException e) {
                    System.out.println("파일을 닫는 동안 오류가 발생했습니다.");
                }
                System.out.println("파일을 닫았습니다.");
            }
            System.out.println("자원을 해제하고 종료합니다.");
        }
    }
}

// 파일이 해당 지정된 경로에 있다면
//지정한 경로에 파일이 존재합니다.
//파일을 닫았습니다.
//자원을 해제하고 종료합니다.
//
//Process finished with exit code 0

// try-with-resources (자동 리소스 관리) 예제
