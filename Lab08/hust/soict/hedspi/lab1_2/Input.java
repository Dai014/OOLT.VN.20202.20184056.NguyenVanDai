package hust.soict.hedspi.lab1_2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your name ? ");
        String strName = keyboard.nextLine();
        System.out.println("How old are you? ");
        int iAge = keyboard.nextInt();
        System.out.println("How tall are you (m)?");
        double dHeight = keyboard.nextDouble();
        System.out.println("Mrs/Ms: " + strName + ", " + iAge + " Years old. " + "Your tall " + dHeight);
    }

    public static class Main_3 {
        public static void main(String[] args) {
            SecondDegreeEquation eq = new SecondDegreeEquation();
            eq.setA(2);
            eq.setB(-7);
            eq.setC(9);
            System.out.println(eq.Results());
        }
    }
}
