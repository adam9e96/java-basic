package chapter26_designPattern.adapter;

/**
 * ===========================================================
 * fileName       : Adapter
 * date           : 2024-02-16
 * description    : Adapter 디자인 패턴 적용
 * ===========================================================
 */
interface AdapterService {// JDBC API
    void runService();
}

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

public class Adapter {
    public static void main(String[] args) {
        AdapterService asa1 = new AdapterServiceA();
        AdapterService asb1 = new AdapterServiceB();

        // 동일한 메서드 명을 사용할 수 있음. => 동일한 표준을 사용한다는 뜻
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

1. **타겟(Target)**: 클라이언트가 기대하는 인터페이스입니다. 클라이언트가 사용할 수 있는 작업을 정의합니다.

2. **어댑티(Adaptee)**: 클라이언트가 직접 사용할 수 없는 기존 인터페이스입니다. 호환성 때문에 직접적으로 사용할 수 없는 인터페이스입니다.

3. **어댑터(Adapter)**: 타겟 인터페이스를 구현하고, 어댑티의 인스턴스를 포함하는 클래스입니다. 클라이언트의 요청을 어댑티가 이해할 수 있는 형식으로 변환하고 적절히 전달합니다.

어댑터 패턴을 사용하면 기존 시스템, 써드파티 라이브러리 또는 서로 다른 인터페이스를 가진 클래스를 소스 코드를 수정하지 않고도 애플리케이션에 통합할 수 있습니다. 이는 코드 재사용성, 유연성 및 시스템 유지보수성을 촉진합니다.
 */

// 우리는 해당 제조사가 구현한 디테일한 내용에 대해 알 필요가 없다.
// 표준화된 기술과 방법을 알고 있으면 어떤 환경에서든 쉽게 사용이 가능하다.