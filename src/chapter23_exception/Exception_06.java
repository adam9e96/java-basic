package chapter23_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * {@code Exception_06} 클래스는 파일 I/O 작업에서 자원 관리를 효율적으로 수행하기 위해
 * try-with-resources 구문을 사용하는 방법을 보여줍니다.
 *
 * <p>이 클래스는 지정된 파일 경로에 파일이 존재하는지 확인하고, 파일이 존재할 경우
 * 이를 열고 처리한 후 자동으로 파일을 닫습니다.</p>
 *
 * <p><b>주요 개념:</b></p>
 * <ul>
 *   <li><b>try-with-resources 구문:</b> 자원을 자동으로 해제하는 Java의 기능을 사용하여
 *   코드가 간결하고 안전하게 작성됩니다. 이 예제에서는 {@link FileInputStream}을 사용하여 파일을 처리합니다.</li>
 *   <li><b>예외 처리:</b> {@link FileNotFoundException}과 {@link IOException} 예외를
 *   처리하여 파일이 존재하지 않거나, 파일을 닫는 과정에서 발생할 수 있는 문제를 다룹니다.</li>
 *   <li><b>코드의 간결성:</b> try-with-resources 구문을 사용하여 리소스를 명시적으로 닫기 위한
 *   {@code finally} 블록을 작성할 필요가 없으므로, 코드가 더 간결해집니다.</li>
 * </ul>
 *
 * <p><b>코드 동작 흐름:</b></p>
 * <ul>
 *   <li>파일 경로가 주어지면, {@code FileInputStream}을 사용하여 파일을 엽니다.</li>
 *   <li>파일이 존재할 경우, "지정한 경로에 파일이 존재합니다."라는 메시지를 출력합니다.</li>
 *   <li>파일이 존재하지 않을 경우, {@link FileNotFoundException}을 처리하여
 *   "지정한 경로에 파일이 존재하지 않습니다."라는 메시지를 출력합니다.</li>
 *   <li>파일을 닫는 과정에서 {@link IOException}이 발생할 경우,
 *   {@link RuntimeException}으로 다시 던져집니다.</li>
 * </ul>
 *
 * <p><b>try-with-resources의 장점:</b></p>
 * <ul>
 *   <li>자동 자원 해제: {@code try-with-resources} 구문은 {@link AutoCloseable} 인터페이스를
 *   구현한 리소스를 자동으로 닫아줍니다. 이를 통해 자원을 수동으로 해제할 필요가 없습니다.</li>
 *   <li>간결한 코드: 자원을 해제하는 코드를 명시적으로 작성할 필요가 없으므로 코드가 간결해집니다.</li>
 *   <li>예외 처리: 자원 해제 중 발생할 수 있는 예외도 처리할 수 있습니다.</li>
 * </ul>
 *
 * @since 2024.07.31
 */
public class Exception_06 {
    public static void main(String[] args) {
//        String path = ".\\sample_file\\test.txt"; // 파일 경로 지정
        String path = "C:\\dev\\projects\\7. java\\java-basic\\src\\chapter23_exception\\sample_file\\test.txt"; // 파일 경로 지정

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
         * 자동 자원 해제: try-with-resources 구문은 AutoCloseable 인터페이스를 구현한 리소스를 자동으로 닫아줍니다.
         * 이를 통해 자원을 수동으로 해제할 필요가 없습니다.
         * 간결한 코드: 자원을 해제하는 코드를 명시적으로 작성할 필요가 없으므로 코드가 간결해집니다.
         * 예외 처리: 자원 해제 중 발생할 수 있는 예외도 처리할 수 있습니다.
         */
    }
}
