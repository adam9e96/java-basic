package chapter26_designPattern.adapter;

/**
 * ===========================================================
 * fileName       : AdapterNo
 * date           : 2024-02-16
 * description    :  Adapter 패턴 사용 X
 * Adapter 패턴을 사용하지 않았을 때 발생하는 문제점
 *     인터페이스 불일치: WorkMan과 StudyStudent 클래스는 서로 다른 인터페이스를 가지고 있습니다.
 *     이들을 동일한 방식으로 사용하기 위해서는 각 클래스의 메서드를 호출하는 방식을 다르게 구현해야 합니다.
 *
 *     유연성 부족: 새로운 요구 사항이나 변화가 발생할 경우,
 *     두 클래스 간의 호환성을 유지하기 위해 코드를 변경해야 합니다. 이는 유연성이 부족하다는 것을 의미합니다.
 *
 *     재사용성 감소: WorkMan과 StudyStudent 클래스는 각각의 역할을 하기 위해 구현되었으며,
 *     이를 재사용하기 위해서는 해당 클래스를 그대로 사용해야 합니다. 즉, 다른 클래스에서도 같은 기능을 사용하기 위해서는 중복 코드가 발생할 수 있습니다.
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
    public static void main(String[] args) {  // WorkMan과 StudyStudent를 각각 인스턴스화하고, 해당 클래스의 메서드를 직접 호출하여 각각의 동작을 실행
        WorkMan workMan = new WorkMan();
        StudyStudent studyStudent = new StudyStudent();

        // 유사한 기능이라 하더라도 새로운 클래스가 생성되면 메서드의 사용법을 공부해야 함.
        workMan.runWork();
        studyStudent.runStudy();
    }
}
