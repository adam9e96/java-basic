package chapter24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ===========================================================
 * fileName       : Exception03
 * date           : 2024-02-02
 * description    :
 * DB랑 작업할때 많이 사용하는 try/catch 패턴임
 * ===========================================================
 */
public class Exception03 {
    public static void main(String[] args) {
        // finally 를 사용하는 예.
        // 디비나 파일의 경우 사용 후에는 닫아줘야 함.(close() 실행)
        String path = ".\\sample_file\\test.txt";    // 이스케이프 문자 \ 를 사용하여 \\로 나타냄 . .점은 현재위치임
        FileInputStream fileInputStream = null;

        try {                           // 객체로 파일의 경로를 지정한거 받음
            fileInputStream = new FileInputStream(path);    // 예외 발생
            System.out.println("지정한 경로에 파일이 존재합니다.");   // 실행 안됨    // 만약 파일이 있따면 실행됨
        } catch (FileNotFoundException e) {
            System.out.println("지정한 경로에 파일이 존재하지 않습니다.");   // 실행됨
        } finally {   // 무조건 실행하는 문장  // 예외 발생 여부에 상관없이 실행됨
            if (fileInputStream != null) {  // 파일이 정상적으로 있었다면
                try {   // 파일주소가 참조변수로 안들어갔다면 null임 위에 null초기화했으므로
                    fileInputStream.close();
                } catch (IOException e) {
                    ;
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


// try - with - resource(자동 리소스 관리)
