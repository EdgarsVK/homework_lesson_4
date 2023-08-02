public class Main {
    public static void main(String[] args) {

        // Упражнение 1: Переполнение переменных

        byte varByte = 10;
        short varShort = 1000;
        int varInt = 100000;
        long varLong = 10000000;

        int a = Integer.MAX_VALUE; // Максимальное значение для типа int
        int b = 20;

        // Переполнение переменной a при выполнении операции a + 1
        // Выводим результат в консоль
        System.out.println("Overflow: " + (a + 1));

        // Выполнение математических операций для целочисленных типов
        a = 30000;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        // Условные операторы
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

        // Упражнение 2: Вычисления комбинаций типов данных (int и double)
        double c = 10.5;

        // Выполнение математических операций между int и double, результат будет типа double
        System.out.println("b + c = " + (b + c));
        System.out.println("b - c = " + (b - c));
        System.out.println("b * c = " + (b * c));
        System.out.println("b / c = " + (b / c));
        System.out.println(5 + 2.5); // Вывод результата сложения двух чисел разных типов
    }
}
