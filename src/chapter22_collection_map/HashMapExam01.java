package chapter22_collection_map;

import java.util.HashMap;
import java.util.Map;

/**
 * {@code Student} 클래스는 학번(sno)과 이름(name)을 가진 학생을 나타냅니다.
 * <p>
 * 이 클래스는 {@code hashCode}와 {@code equals} 메서드를 재정의하여
 * 동일한 학번과 이름을 가진 두 {@code Student} 객체가 {@code HashMap}의 키로
 * 사용될 때 동일한 것으로 처리되도록 합니다.
 */
final class Student {
    private final int sno; // 학번
    private final String name; // 학생 이름

    public String getName() {
        return name;
    }

    /**
     * 지정된 학번과 이름으로 {@code Student} 객체를 생성합니다.
     *
     * @param sno  학번
     * @param name 학생의 이름
     */
    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    /**
     * 이 {@code Student} 객체의 해시 코드 값을 반환합니다. 해시 코드는
     * 학생의 이름과 학번을 기반으로 계산됩니다.
     *
     * @return 이 {@code Student} 객체의 해시 코드 값
     */
    @Override
    public int hashCode() {
        return name.hashCode() + sno;
    }

    /**
     * 이 객체가 다른 객체와 "같은지"를 나타냅니다. 결과는 {@code true}이고,
     * 조건은 인자가 {@code null}이 아니며, 이 객체와 동일한 학번과 이름을
     * 가진 {@code Student} 객체일 경우에만 {@code true}를 반환합니다.
     *
     * @param obj 비교할 참조 객체
     * @return 이 객체가 obj 인자와 동일하면 {@code true}, 그렇지 않으면 {@code false}
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {   // 객체가 Student 타입인지 확인
            Student student = (Student) obj;
            return this.name.equals(student.name) && student.sno == this.sno;
        } else {
            return false;
        }
    }
}

/**
 * {@code HashMapExam01} 클래스는 사용자 정의 객체를 키로 사용하는
 * {@code HashMap}의 사용 예제를 보여줍니다. 특히 {@code Student} 클래스의
 * {@code hashCode}와 {@code equals} 메서드가 맵에서 키의 고유성에
 * 어떻게 영향을 미치는지 설명합니다.
 */
public class HashMapExam01 {
    /**
     * 메인 메서드는 프로그램의 진입점입니다. 이 메서드는 {@code Student} 객체를
     * 키로 사용하는 {@code HashMap}을 생성하고, {@code Student} 클래스에서
     * 재정의된 {@code hashCode}와 {@code equals} 메서드가 맵에 저장된 항목
     * 수에 어떻게 영향을 미치는지 보여줍니다.
     */
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        // Student 객체를 키로 사용하여 점수를 저장합니다.
        map.put(new Student(1, "홍길동"), 95); // 새로운 Student 객체를 키로 추가
        map.put(new Student(1, "홍길동"), 90); // 동일한 세부 사항을 가진 새로운 Student 객체는 동일한 키로 간주
        map.put(new Student(1, "박유신"), 85); // 다른 이름을 가진 Student 객체는 다른 키로 간주됨

        // 맵에 저장된 총 항목 수를 출력
        System.out.println("총 Entry 수 : " + map.size());

        /*
         * 설명:
         * 출력은 "총 Entry 수 : 2"로 나타납니다. 첫 번째와 두 번째 "홍길동" 학생 객체는
         * 재정의된 hashCode와 equals 메서드에 의해 동일한 키로 간주되므로,
         * 두 번째 put 연산이 첫 번째 것을 덮어씁니다.
         *
         * "박유신" 이름을 가진 세 번째 학생 객체는 다른 키로 처리되어
         * 맵에 두 개의 고유 항목이 저장됩니다.
         */
        for (Map.Entry<Student, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey().getName() + " : " + entry.getValue());
        }
    }
}
