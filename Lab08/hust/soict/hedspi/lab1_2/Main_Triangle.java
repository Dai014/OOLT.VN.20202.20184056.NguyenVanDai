package hust.soict.hedspi.lab1_2;

import java.util.Scanner;

public class Main_Triangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int height = keyboard.nextInt();
        Triangle trian = new Triangle();
        trian.Triangle_Result(height);
    }
}
