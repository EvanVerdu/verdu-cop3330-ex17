package Exercise17;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise17 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 1 if you are male or a 2 if you are female? ");
        String gender = scanner.nextLine();

        System.out.print("How many ounces of alcohol did you have? ");
        String ounces = scanner.nextLine();

        System.out.print("What is your weight, in pounds? ");
        String weight = scanner.nextLine();

        System.out.print("How many hours has it been since your last drink? ");
        String lastdrink = scanner.nextLine();

        System.out.println(" ");
        int Gender = 0;
        int Ounces = 0;
        int Weight = 0;
        int LastDrink = 0;

        try {
             Gender = Integer.parseInt(gender);
        } catch (NumberFormatException nfe) {
            System.out.print("Please enter a number value for gender next time.");
            System.exit(0);
        }

        try {
            Ounces = Integer.parseInt(ounces);
        } catch (NumberFormatException nfe) {
            System.out.print("Please enter a number value for the ounces next time.");
            System.exit(0);
        }

        try {
            Weight = Integer.parseInt(weight);
        } catch (NumberFormatException nfe) {
            System.out.print("Please enter a number value for the weight next time.");
            System.exit(0);
        }

        try {
            LastDrink = Integer.parseInt(lastdrink);
        } catch (NumberFormatException nfe) {
            System.out.print("Please enter a number value for the time after the last drink next time.");
            System.exit(0);
        }





        double BAC;
        double GenderRate = 1;
        String result;

        if (Gender == 1){
           GenderRate = 0.73;
        }

        else if (Gender == 2){
            GenderRate = 0.66;
        }

        BAC = (((Ounces * 5.14)/Weight) * GenderRate) - (.015 * LastDrink);
        System.out.println("Your BAC is " + String.format("%.6f", BAC));

        result = (BAC < 0.08) ? "It is legal for you to drive." : "It is not legal for you to drive.";
        System.out.print(result);


    }

}
