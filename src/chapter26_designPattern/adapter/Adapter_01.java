package chapter26_designPattern.adapter;

/**
 * ===========================================================
 * fileName       : Adapter
 * date           : 2024-02-16
 * description    : Adapter 디자인 패턴 적용
 * Adapater 패턴을 적용하여 `AdapterService` 인터페이스를 통해 두 클래스의 기능을 표준화된 방식으로 호출하는 것을 보여준다.
 * 어댑터 패턴(Adapter Pattern)은 서로 다른 인터페이스를 가진 클래스들이 함께 작동할 수 있도록 중간에 매개체 역할을 하는 디자인 패턴입니다.
 *
 * ===========================================================
 */
// 인터페이스 정의
// AdapterService 인터페이스를 정의하여 표준화된 메서드 runService()를 사용하여 서로 다른 클래스의 기능을 호출할 수 있도록 함.
interface AdapterService {// e.g ) JDBC API // 타겟 인터페이스 역할을 한다
    void runService();  // 공통된 기능을 하는 표준화된 메서드 선언
}

//  어댑터 클래스 구현 // 어앱터 역할을 한다.
//  AdapterServiceA와 AdapterServiceB 클래스가 `AdapterService` 인터페이스를 구현하여
//  각각의 클래스의 기능을 runService() 메서드로 노출시킴
//  이들 클래스는 각각 WorkMan과 StudyStudent 클래스(어댑티)의 기능을 runService 메서드를 통해 표준화된 방식으로 제공

// Adapter 클래스 사용: Adapter 클래스에서는 AdapterService 인터페이스를 통해
// AdapterServiceA와 AdapterServiceB 객체를 생성하고,
// 표준화된 방식으로 각각의 서비스를 실행하는 것을 보여줍니다.
class AdapterServiceA implements AdapterService {   // MySQL
    WorkMan workMan = new WorkMan();

    @Override
    public void runService() {
        workMan.runWork();
    }
}

class AdapterServiceB implements AdapterService {   // SQLServer
    StudyStudent studyStudent = new StudyStudent();

    @Override
    public void runService() {
        studyStudent.runStudy();
    }
}

public class Adapter_01 {
    public static void main(String[] args) {
        AdapterService asa1 = new AdapterServiceA();
        AdapterService asb1 = new AdapterServiceB();

        // 동일한 메서드 명을 사용할 수 있음. => 즉, 동일한 표준을 사용한다는 뜻
        asa1.runService();
        asb1.runService();
        // 해당 메소드는 표준화된 규격이라고 볼 수 있음.
    }
}
/*
어댑터 패턴(Adapter Pattern)은 소프트웨어 엔지니어링에서 사용되는 구조적 디자인 패턴으로,
호환되지 않는 인터페이스 간에 작동할 수 있도록 합니다.
한 클래스의 인터페이스를 다른 클래스의 인터페이스로 변환하여 호환되도록 만들어주는 역할을 합니다.

어댑터 패턴은 기본적으로 두 개의 호환되지 않는 인터페이스 사이에서 연결 역할을 하며,
이를 통해 다른 클래스들이 함께 작동할 수 있게 합니다.

어댑터 패턴의 주요 구성 요소는 다음과 같습니다:

어댑터 패턴을 사용하면 기존 시스템, 써드파티 라이브러리 또는 서로 다른 인터페이스를 가진 클래스를 소스 코드를 수정하지
않고도 애플리케이션에 통합할 수 있습니다. 이는 코드 재사용성, 유연성 및 시스템 유지보수성을 촉진합니다.
 */

// 우리는 해당 제조사가 구현한 디테일한 내용에 대해 알 필요가 없다.
// 표준화된 기술과 표준화된 사용방법만 알고 있으면 어떤 환경에서든 쉽게 사용이 가능하다.