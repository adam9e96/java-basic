package chapter26_designPattern.adapter;

/**
 * ===========================================================
 * fileName       : AdapterNo
 * date           : 2024-02-16
 * description    :
 * ===========================================================
 */
class WorkMan {
    void runWork() {
        System.out.println("work");
    }
}

class StudyStudent {
    void runStudy() {
        System.out.println("study");
    }
}

public class AdapterNo {
    public static void main(String[] args) {
        WorkMan workMan = new WorkMan();
        StudyStudent studyStudent = new StudyStudent();

        // 유사한 기능이라 하더라도 새로운 클래스가 생성되면 메서드의 사용법을 공부해야 함.
        workMan.runWork();
        studyStudent.runStudy();
    }
}
