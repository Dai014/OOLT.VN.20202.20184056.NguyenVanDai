package hust.soict.hedspi.lab1_2;

public class Main_matrix {
    public static void main(String[] args) {
        SumMatrix sum = new SumMatrix();
        sum.setN(2);
        sum.setM(2);
        sum.setMatrixA();
        sum.setMatrixB();
        sum.printMatrixA();
        sum.printMatrixB();
        sum.sumMatrix();
    }
}
