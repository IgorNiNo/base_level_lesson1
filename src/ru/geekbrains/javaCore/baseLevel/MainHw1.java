package ru.geekbrains.javaCore.baseLevel;

public class MainHw1 {

    public static void main(String[] args) {

        //задание 2
        byte valueByte = 127;
        short valueShort = 1000;
        int valueInt = 10000;
        long valueLong = 10000000000000L;
        float valueFloat = 3.14f;
        double valueDouble = 3.14159265359;
        char valueChar = '%';
        boolean valueBool = true;
        System.out.println("Переменная типа byte = " + valueByte);
        System.out.println("Переменная типа short = " + valueShort);
        System.out.println("Переменная типа int = " + valueInt);
        System.out.println("Переменная типа long = " + valueLong);
        System.out.println("Переменная типа float = " + valueFloat);
        System.out.println("Переменная типа double = " + valueDouble);
        System.out.println("Переменная типа char = " + valueChar);
        System.out.println("Переменная типа boolean = " + valueBool);

        //задание 3
     /*   float a, b, c, d;
        a = 2.5f;
        b = 5.0f;
        c = 3.0f;
        d = 10.0f;
        System.out.println("\nЕсли a = " + a +", b = " + b + ", c = " + c + ", d = " + d);
        System.out.println("То результат вычисления a * (b + (c / d)) = " + calculate(a, b, c, d));
      */
        //или
        System.out.println("\nРезультат вычисления a * (b + (c / d)) = " + calculate(2.5f, 5.0f, 3.0f, 10.0f));

        //задание 4
/*        int a1 = 1;
        int a2 = 8;
        System.out.println("\nСумма числел " + a1 + " и " + a2 + " лежит в диапазоне от 10 до 20 включительно (да/нет)? - " + task10and20(a1, a2));
*/
        //
        System.out.println("\nСумма числел лежит в диапазоне от 10 до 20 включительно (да/нет)? - " + task10and20(1, 8));

        //задание 5
        isPositiveOrNegative(0);

        //задание 6
        System.out.println("Негатив записанного числа - " + isNegative(0));

        //задание 7
        helloName("Игорь");

        //задание 8
        System.out.println();   //напечатаю пустую строку
        year(400);

    }

    //метод для задания 3
    public static float calculate(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    //метод для задания 4
    public static boolean task10and20(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else{
            return false;
        }
    }

    //метод для задания 5
    public static void isPositiveOrNegative(int x){
        if (x >= 0){
            System.out.println("\nВы записали положительное число");
        } else {
            System.out.println("\nВы записали отрицательное число");
        }
    }

    //метод для задания 6
    public static boolean isNegative(int x){
        if (x >= 0){
            return false;
        } else {
            return true;
        }
    }

    //метод для задания 7
    public static void helloName(String name){
        System.out.println("\nПривет, " + name + "!");
    }

    //метод для задания 8
    public static void year(int x){
        if ( x%4 == 0 && (x%100 != 0 || x%400 == 0) ) {
            System.out.println(x + "-й год является високосным");
        } else {
            System.out.println(x + "-й год не является високосным");
        }
    }
}
