package hust.soict.hedspi.lab1_2;

public class Triangle {
    public int height;

    public Triangle() {
    }

    public void Triangle_Result(int h){
        this.height = h;
        for(int i = 1; i <= this.height; i++) {
            for(int j = 1; j <= this.height-i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}