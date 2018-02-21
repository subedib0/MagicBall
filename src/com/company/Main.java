package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("will I win the lottery tomorrow ");
        int number = 0;

        boolean questionM = false;
        Random r = new Random();
        int x = 1 + r.nextInt(20);
        while (true) {

            number = scan.nextInt();

            System.out.print("value of x:" );
            x++;

            System.out.println();

            if (x == 1) {
                System.out.println("It is Certain");

            } else if (x == 2) {
                System.out.println("It is decidedly so");
            } else if (x == 3) {
                System.out.println("Without a doubt");
                System.out.println();
            } else if (x == 4) {
                System.out.println("yes Definately");
            } else if (x == 5) {
                System.out.println("You may relay on it");

            } else if (x == 6) {
                System.out.println("As I see it, yes");


            } else if (x == 7) {
                System.out.println("Most Likely");
            } else if (x == 8) {
                System.out.println("Outlook Good");
            } else if (x == 9) {
                System.out.println("Yes");
            } else if (x == 10) {
                System.out.println("Signs Point to Yes");
            } else if (x == 11) {
                System.out.println("Reply Hazy try again");
            } else if (x == 12) {
                System.out.println("Ask Again Later");
            } else if (x == 13) {
                System.out.println("Better not to tell you now");
            } else if (x == 14) {
                System.out.println("Can not Predcit Now");
            } else if (x == 15) {
                System.out.println("Concentrate and ask again");
            } else if (x == 16) {
                System.out.println("Do not count on it");
            } else if (x == 17) {
                System.out.println("My reply is no");
            } else if (x == 18) {
                System.out.println("My sources say no");
            } else if (x == 19) {
                System.out.println("Outlook not so good");
            } else if (x == 20) {
                System.out.println("Very Doughtfull");

            }

            System.out.println();
            scan = new Scanner(System.in);

            System.out.println("Do you have another Question to magic ball? (y/n)");
            String question = scan.nextLine();

            if (question.equals("y")) {
                questionM = true;


            }
        }
    }
}