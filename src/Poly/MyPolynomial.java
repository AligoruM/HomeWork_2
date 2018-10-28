package Poly;

public class MyPolynomial {
    private double[] coef;

    public MyPolynomial(double... coef) {
        this.coef = coef;
    }

    public int getDegree(){
        return coef.length-1;
    }

}
