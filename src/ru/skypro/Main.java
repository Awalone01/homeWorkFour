package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //задача 1
        int i = 0;

	    while (i < 10){
            i++;
            System.out.print(i);
        }
        System.out.println();
	    for (int b = 10; b > 0; b--) {
            System.out.print(b);
        }
        System.out.println();

	    //задача 2
        int friday = 5;

	    for (; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

	    //задача 3
        int year;

        for (year = 1821; year < 2121; year = year + 79) {
            System.out.println(year);
        }

    }
}
