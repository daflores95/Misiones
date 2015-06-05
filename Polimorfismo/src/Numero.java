/**
 * Created by Diego on 6/5/2015.
 */
public class Numero {
    private int num1 = 0;
    private double num2= 0;

    public void set (int num){
        num1 = num;
    }
    public void set (double num){
        num2 = num;
    }
    public void set (int num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    //get
    public int getNum1(){
        return num1;
    }

    public double getNum2() {
        return num2;
    }
}
