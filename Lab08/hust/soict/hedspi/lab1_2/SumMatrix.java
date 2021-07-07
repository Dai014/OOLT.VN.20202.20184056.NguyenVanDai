package hust.soict.hedspi.lab1_2;

import java.util.Scanner;

public class SumMatrix {
    int m;
    int n;

    public void setM(int m) {
        this.m = m;
    }

    public void setN(int n) {
        this.n = n;
    }

    int A[][] = new int[10][10];
    int B[][] = new int[10][10];
    int Sum[][] = new int[10][10];


    public void setMatrixA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
    }
    public void setMatrixB() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử cho ma trận B:");
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.print("B[" + i + "," + j + "] = ");
                B[i][j] = scanner.nextInt();
            }
        }
    }

    public void printMatrixA() {
        System.out.println("Ma tran:");
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    public void printMatrixB() {
        System.out.println("Ma tran:");
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    public void sumMatrix(){
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                Sum[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Ma trận tổng C:");
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.print(Sum[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
