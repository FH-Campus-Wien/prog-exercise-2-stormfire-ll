package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        float value;
        int i = 1;
        int maxValue;


        do {
            System.out.print("Number " + i + ": ");
            value = scan.nextFloat();
            i++;
        } while (value >0);

        if (value < 0) {
            // nur erste eingegebene Zahl?
            System.out.println("No number entered");
        }

        if (value != 0 || i < 0) {
            //größte Zahl ausgeben
        }


    }
    //%

    //todo Task 2
    public void stairs(){
        // input your solution here
    }

    //todo Task 3
    public void printPyramid(){
        final int ROWS = 6;

        // jede Zeile 1 mal durchlaufen
        for (int i = 0; i < ROWS; i++) {
            //Ausgabe der Leerzeichen
            for (int j = 0; j < ROWS - 1 - i; j++)
                System.out.print(" ");
            //Stern ausgeben
            for (int k = 0; k < (2 * i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}