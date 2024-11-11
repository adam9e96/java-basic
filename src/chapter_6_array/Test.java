package chapter_6_array;

public class Test {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int count = 0;
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(++count);
                System.out.print(a[i][j] + " ");
            }
        }
//        init(a);
//        data(a);
//        prnt(a);
    }

    static void init(int a[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = i;
            }
            System.out.println();
        }
    }

    static void data(int a[][]) {
        int v = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = v++;
            }
        }
    }

    static void prnt(int a[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == 0) {
                    System.out.print(a[i][j] + " ");
                } else
                    System.out.println(a[i][j]);
            }
            System.out.println();
        }
    }
}
