package com.example.shaha.lesson3;

/**
 * Created by shaha on 26.01.2018.
 */

public class DiscriminateCalculator extends QuadraticActivity {


    protected double a;
    protected double b;
    protected double c;


    public DiscriminateCalculator(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    public double getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }


    public double CalculateD (){

        return  Math.sqrt(b*b-4*a*c);
    }

    public double calculateRoot1(){

        return  (-b-Math.sqrt(b*b-4*a*c))/(2*a);
    }
    public double calculateRoot2(){
        return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
    }

}
