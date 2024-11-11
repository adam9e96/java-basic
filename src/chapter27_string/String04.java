package chapter27_string;

public class String04 {
    public static void main(String[] args) {

        String str = "abc";
        System.out.println(str.hashCode()); // 96354

        System.out.println(str.length());

        String newStr = str;
        System.out.println(newStr.hashCode());
        System.out.println(newStr.length());

        String newStrV2 = new String(newStr);
        System.out.println(newStrV2.hashCode());
        System.out.println(newStrV2.length());


        String newStrV3 = new String("abc");
        System.out.println(newStrV3.hashCode());
        System.out.println(newStrV3.length());
    }
}
