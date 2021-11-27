package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //задача 1
        int i = 0;

	    while (i < 10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
	    for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println();

	    //задача 2
        int firstFriday = 3;

	    for (; firstFriday <= 31; firstFriday += 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }

	    //задача 3
        int presentYear = 2021;
	    int pastYear = presentYear - 200;
	    int futureYear = presentYear + 100;

        for (int j = pastYear; j < futureYear; j++) {
            if (j % 79 == 0) {
                System.out.println(j);
            }
        }

        //задача 4
        System.out.println();
        int b = 1;

        for (;  b <= 30; b++){
            if (b % 3 == 0){
                System.out.println(b + ": ping");
            } if (b % 5 == 0){
                System.out.println(b + ": pong");
            } else if (b % 3 == 0 && b % 5 == 0) {
                System.out.println(b + ": ping pong");
            }  else {
                System.out.println(b);
            }
        }

        //задача 5
        //Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:
        //– Каждое следующее число равняется сумме двух предыдущих.
        //Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
        //Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
        //Должно получиться следующее:
        //0 1 1 2 3 5 8 13 21 34
        //Справка
        //Числа Фибоначчи – элементы числовой последовательности
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, … ,
        // в которой первые два числа равны 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел.
        System.out.println();
        int firstNum = 0;
        int secondNum = 1;

        System.out.print(firstNum + " ");
        for (int thirdNum = firstNum + secondNum; thirdNum <= 34; thirdNum = firstNum + secondNum) {
            System.out.print(thirdNum + " ");
            firstNum = secondNum;
            secondNum = thirdNum;
        }
    }
}
