package hust.soict.hedspi.lab1_2;

public class Test_2 {
    public static void main(String[] args) {
        Equations eq = new Equations();
        eq.setA11(4);
        eq.setA12(-2);
        eq.setB1(3);
        eq.setA21(6);
        eq.setA22(-3);
        eq.setB2(5);
        System.out.println(eq.Result());
    }
}
