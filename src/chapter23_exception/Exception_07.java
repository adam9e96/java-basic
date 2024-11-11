package chapter23_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * {@code Exception_07} 클래스는 Java에서 예외 처리를 사용하는 방법을
 * 보여주며, 특히 try-with-resources 문법에 중점을 둡니다. 이 예제는
 * 텍스트 파일을 한 줄씩 읽고 그 내용을 콘솔에 출력합니다.
 *
 * <p>이 클래스의 목적은 파일 I/O 작업 중 발생할 수 있는 {@link IOException}을
 * 처리하는 방법을 설명하는 것입니다. try-with-resources를 사용하면
 * 작업이 완료된 후에도, 예외가 발생하더라도 {@link BufferedReader} 리소스가
 * 자동으로 닫히도록 보장합니다.</p>
 *
 * <p><b>시연되는 개념:</b></p>
 * <ul>
 *   <li><b>예외 처리:</b> 이 예제는 try-catch 블록을 사용하여 예외를 처리하는 방법을
 *   보여줍니다. 특히, 파일 읽기 작업 중 발생할 수 있는 {@link IOException}을
 *   잡습니다.</li>
 *   <li><b>Try-with-Resources:</b> 이 Java 기능은 try 블록 내에서 사용된 리소스가
 *   블록이 실행된 후 자동으로 닫히도록 보장하여 리소스 누수를 방지합니다.</li>
 *   <li><b>파일 I/O:</b> 이 예제는 {@link BufferedReader}와 {@link FileReader}를
 *   사용하여 파일의 내용을 한 줄씩 읽습니다.</li>
 * </ul>
 *
 * @since 2024.07.31
 */
public class Exception_07 {
    public static void main(String[] args) {
//        String path = ".\\sample_file\\test.txt"; // 파일 경로
        String path = "C:\\dev\\projects\\7. java\\java-basic\\src\\chapter23_exception\\sample_file\\test.txt"; // 파일 경로

        // Try-with-resources 구문
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
        }
    }
}
