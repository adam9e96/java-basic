package chapter13.test;

public class Test2 {
    String color; // 색상
    String gearType; // 변속기 종류
    int door; // 문의 개수


    public Test2(){
        this("white","auto",4);
    }
    public Test2(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    public  Test2(String color){
        this(color,"manual",4);
    }
}
