package chapter18.abstract_exam01;

/*
HttpServlet 추상 클래스와 LoginServlet, FileDownloadServlet 클래스가 있다.
메인 클래스와 출력결과를 보고 LoginServlet, FileDownloadServlet 클래스를 완성하세요.
출력 결과)
로그인 합니다.
파일 다운로드 합니다.
 */
abstract class HttpServlet {
    public abstract void service();
}
public class Main {
    public static void main(String[] args) {
        method(new LoginServlet());
        method(new FildDownloadServlet());

//        HttpServlet http = new LoginServlet();
//        http.service();
    }
    public static void method(HttpServlet servlet){
        servlet.service();
        // 로그인 합니다.
        // 파일 다운로드 합니다.
    }
}
