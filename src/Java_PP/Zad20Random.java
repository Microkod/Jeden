package Java_PP;

import java.util.Random;
import java.util.Scanner;

public class Zad20Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomInt = random.nextInt(100 - 0) + 1;


        System.out.println("wprowadz liczbe 0-100");
        int userNumber = scanner.nextInt();

        if (randomInt > userNumber) {
            System.out.println("za mało");
        } else if (randomInt < userNumber) {
            System.out.println("za dużo");
        } else {
            System.out.println("BINGOO");
        }

        System.out.println(randomInt);
    }
}
