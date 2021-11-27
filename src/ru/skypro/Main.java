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

    }
}
