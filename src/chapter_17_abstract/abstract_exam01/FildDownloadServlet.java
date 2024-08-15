package chapter_17_abstract.abstract_exam01;

public class FildDownloadServlet extends HttpServlet{

    FildDownloadServlet(){
    }
    @Override
    public void service() {
        System.out.println("파일 다운로드 합니다.");
    }
}
