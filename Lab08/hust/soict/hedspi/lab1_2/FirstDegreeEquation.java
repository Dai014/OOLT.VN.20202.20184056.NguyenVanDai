package hust.soict.hedspi.lab1_2;

public class FirstDegreeEquation{
    private int a;
    private int b;
    public int getA(){
        return this.a;
    }
    public void setA(int a){
        this.a = a;
    }
    public int getB(){
        return this.b;
    }
    public void setB(int b){
        this.b = b;
    }

    public String Resolve(){
        if (a==0 && b==0)
            return ("phuong trinh co vo so nghiem");
        else if(a!=0)
            return ("phuong trinh co mot nghiem: " + (float)-b/a );
        else
            return ("phuong trih vo nghiem ");
    }
}
