package java1;

public class Main {
    public static void main(String[] args) {

        // ?????????? 1: ???????????? ??????????

        byte varByte = 10;
        short varShort = 1000;
        int varInt = 100000;
        long varLong = 10000000;

        int a = Integer.MAX_VALUE; // ???????????? ???????? ??? ???? int
        int b = 20;

        // ???????????? ?????????? a ??? ?????????? ???????? a + 1
        // ??????? ????????? ? ???????
        System.out.println("Overflow: " + (a + 1));

        // ?????????? ?????????????? ???????? ??? ????????????? ?????
        a = 30000;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        // ???????? ?????????
        if (a > b) {
            System.out.println("a + b = " + (a + b));
        } else {
            System.out.println("a - b = " + (a - b));
        }

        if (a > 0 && b < 50) {
            System.out.println("a * b = " + (a * b));
        }

        a = -5000;
        if (a > 0 || b < 50) {
            System.out.println("a / b = " + (a / b));
        }

        System.out.println("=============");

        // ?????????? 2: ?????????? ?????????? ????? ?????? (int ? double)
        double c = 10.5;

        // ?????????? ?????????????? ???????? ????? int ? double, ????????? ????? ???? double
        System.out.println("b + c = " + (b + c));
        System.out.println("b - c = " + (b - c));
        System.out.println("b * c = " + (b * c));
        System.out.println("b / c = " + (b / c));
        System.out.println(5 + 2.5); // ????? ?????????? ???????? ???? ????? ?????? ?????
    }
}