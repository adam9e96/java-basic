package chapter_22_collection_map.hashMapExam;/*
 * ===========================================================
 * fileName       : HashMapExam01
 * date           : 2024-01-29
 * description    : hashMap 테스트
 hashCode와 equals를 조절해서 동일한 키와 값이라면 동일하게 인식하기.

 * ===========================================================
 */

import java.util.HashMap;
import java.util.Map;

class Student { // 학번과 키가 같다면 동일한 키로 인식
    public int sno;
    public String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + sno;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {   // 이건 타입 변환이 되는지 확인하는거
            Student student = (Student) obj;
            return this.name.equals(student.name) && student.sno == this.sno;
        } else {
            return false;
        }
    }
}

public class HashMapExam01 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        // 학번과 이름이 동일한 Student 를 키로 저장.
        map.put(new Student(1, "홍길동"), 95); // 새로운 Student 객체를 키로 하여 추가
        map.put(new Student(1, "홍길동"), 95);  // new를 쓰여서 다른 객체 주소를 가져서 다른 녀석으로 인식해서 저장됨// 다른객체로봄
        map.put(new Student(1, "박유신"), 85);

        System.out.println("총 Entry 수 : " + map.size());
        // 저장된 총 Map.Entry 수 얻기
        // key 가 1개만 되는줄 알았는데 타입이 객체라면
        // 객체 필드를 여러개 넣을 수 있음

        // 만약 학번하고 이름이 동잃다면  >> hash
    }
}

/*
맞습니다. 결과값이 "총 Entry 수 : 2"로 나오면 `HashMap` 객체에는 두 개의 엔트리(키-값 쌍)가 포함되어 있다는 것을 의미합니다. 하지만 객체 수 자체는 `HashMap`이 아니라 `Student` 객체를 생성할 때마다 증가합니다.

여기서 중요한 점은 학번과 이름이 같은 `Student` 객체를 서로 다른 객체로 인식하므로, 서로 다른 객체에 대해 맵에 추가되었습니다. 따라서 `new Student(1, "홍길동")`을 두 번 사용하더라도 각각 새로운 객체로 취급되어 맵에 두 개의 엔트리로 기록됩니다.
 */