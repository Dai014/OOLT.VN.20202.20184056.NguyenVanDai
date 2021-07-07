package hust.soict.hedspi.lab1_2;

import static java.lang.Math.sqrt;

public class SecondDegreeEquation {
    private double a, b, c;
    public double delta;

    public void setA(double a){
        this.a = a;
    }
    public double getA(){
        return this.a;
    }
    public void setB(double b){
        this.b = b;
    }
    public double getB(){
        return this.b;
    }
    public void setC(double c){
        this.c = c;
    }
    public double getC(){
        return this.c;
    }

    public String Results(){
        delta = b*b - 4*a*c;
        if(delta > 0)
            return ("Phuong trinh co 2 nghiem phan biet x1, x2: " + (-b-sqrt(delta))/(2*a) + ", " + (-b+sqrt(delta))/(2*a));
        else if (delta == 0)
            return ("Phuong trinh co nghiem kep x = " + -b/(2*a) );
        else
            return ("Phuong trinh vo nghiem ");
    }

}
