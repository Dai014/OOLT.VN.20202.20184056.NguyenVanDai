package hust.soict.hedspi.lab1_2;

public class Equations {
    private int a11, a12, a21, a22, b1, b2;
    public double D1, D2, D;

    public void setA11(int a11){
        this.a11 = a11;
    }
    public int getA11(){
        return this.a11;
    }
    public void setA12(int a12){
        this.a12 = a12;
    }
    public int getA12(){
        return this.a12;
    }
    public void setA21(int a21){
        this.a21 = a21;
    }
    public int getA21(){
        return this.a21;
    }
    public void setA22(int a22){
        this.a22 = a22;
    }
    public int getA22() {
        return this.a22;
    }
    public void setB1(int b1){
        this.b1 = b1;
    }
    public int getB1() {
        return this.b1;
    }
    public void setB2(int b2){
        this.b2 = b2;
    }
    public int getB2() {
        return this.b2;
    }

    public String Result(){
        D = this.a11*this.a22 - this.a21*this.a12;
        D1 = this.b1*this.a22-this.b2*this.a12;
        D2 = this.a11*this.b2-this.a21*this.b1;
        if(D!=0)
            return("He phuong trinh co nghiem x, y la: " + D1/D + ", " + D2/D);
        else {
            if( D2 == 0 && D1 == 0 )
                return ("He phuong trinh co vo so nghiem");
            else
                return ("He phuong trinh vo nghiem");
        }
    }
}
