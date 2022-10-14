package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner sc = new Scanner(System.in);
        float value;
        int i = 0;
        float maxValue = 0;

        i++;
        do {
            System.out.print("Number " + i + ": ");
            value = sc.nextFloat();
            i++;
            if (value > maxValue){
                maxValue = value;
            }
        } while (value > 0);

        if (value <= 0 && i == 0) {
            System.out.println("No number entered.");
            return;
        }
        if (value <= 0 && i > 0) {
            System.out.printf("The largest number is %.2f", maxValue);
        }
    }



    //todo Task 2
    //fertig
    public void stairs(){
        // Anzahl der Zeilen einlesen, Int
        Scanner rowScanner = new Scanner(System.in);
        int row;

        System.out.print("n: ");
        row = rowScanner.nextInt();

        /* Eingabe von Zahlen kleiner
        gleich 0 ist nicht erlaubt und verursacht eine Fehlermeldung*/
        if (row <= 0){
            System.out.println("Invalid number!");
        } else if (row > 0){
            //Ausgabe mit 2 Schleifen
            int k =1;
            for (int i = 1; i <= row; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print(k++ + " ");
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    // fertig
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
        Scanner sc = new Scanner(System.in);

        int h;
        int m;
        char c;

        System.out.print("h: ");
        h = sc.nextInt();
        System.out.print("c: ");
        c = sc.next().charAt(0);

        if (h % 2 == 0) {
            System.out.println("Invalid number!");
        } else {

            for (int i = 1; i <= h; i++) {
                for (int j = i; j < h; j++) {     //$
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {      //2.Quadrant
                    System.out.print((char) c-- + " ");
                }
                for (int j = 1; j < i; j++) {       //1.Quadrant
                    System.out.print((char) c-- + " ");
                }
                System.out.println();
            }

            m = h - 1;
            for (int i = 1; i <= m; i++) {
                int p = 1;
                for (int j = 1; j <= i; j++) {       //$
                    System.out.print("  ");
                }
                c = 'a';
                for (int j = i; j <= m; j++) {      //3.Quadrant
                    System.out.print((char)c++ + " ");
                }
                for (int j = i; j < m; j++) {       //4.Quadrant
                    System.out.print((char)c-- + " ");
                }
                System.out.println();
            }
        }
    }

    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        int count = 0;
        double average;
        int negativeCount = 0;
        int sumInput = 0;

        count++;
        while (input != 0) {
            System.out.print("Mark " + count + ": ");
            input = scanner.nextInt();

            if (input <=5 && input != 0){
                count++;
                sumInput = sumInput + input;
            }
            if (input < 0 || input > 5) {
                System.out.println("Invalid Mark!");
                count = count - 1;
            }
            if (input == 5) {
                negativeCount++;
            }
            if (input == 0) {
                average = (double) sumInput / (count-1);
                System.out.printf("Average: %.2f", average);
                System.out.println();
                System.out.println("Negative marks: " + negativeCount);
                break;
            }
        }
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