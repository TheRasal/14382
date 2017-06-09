package Calc;

import Calc.Calculator;
import org.springframework.stereotype.Component;

/**
 * Created by TMS on 02.06.2017.
 */
@Component
public class Minus implements Calculator {
    private double a;
    private double b;


    public Minus(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public Double calc(){
        return a-b;

    }
}
