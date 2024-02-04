package chapter11.ch01;

public class HighSchoolStudent {
    String name;
    String ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal() {
//        int sum = (kor + eng + math);
        return (kor + eng + math);
    }

    double getAverage() {
        double avg;
        avg = getTotal() / 3.0;
        return avg;
    }
}
