package chapter_23_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @since 2024.07.31
 */
public class Exception_07 {
    public static void main(String[] args) {
        String path = ".\\sample_file\\test.txt"; // 파일 경로 지정

        // try-with-resources 구문
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류 발생 :" + e.getMessage());
        }
    }
}
