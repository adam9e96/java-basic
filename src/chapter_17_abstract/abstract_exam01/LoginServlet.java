package chapter_17_abstract.abstract_exam01;

public class LoginServlet extends HttpServlet{

    public LoginServlet(){
    }

    @Override
    public void service() {
        System.out.println("로그인 합니다.");
    }
}
