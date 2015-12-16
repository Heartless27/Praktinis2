/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kreditas;

/**
 *
 * @author Heartless
 */
public class Kreditas {

    private double a, k, l, is;

    public Kreditas(double a, double k, double l, double is) {
        this.a = a;
        this.k = k;
        this.l = l;
        this.is = is;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getIs() {
        return is;
    }

    public void setIs(double is) {
        this.is = is;
    }

    /**
     * Pull up method
     */
    public double kreditosuma(double k, double l) {
        double p = 0.04; //metine palukanu norma 4%
        return k + (k * l * p);
    }

    public double imokosAp(double K, double l) {
        return k / (l * 12); // imokos apskaiciavimas
    }

    /**
     * END OF Pull up method
     */
    
    
    /**
     * DECOMPOSE CONDITIONAL
     */
    public boolean arSuteikiamasKreditas(double num) {
        return ((num / this.getA()) * 100) <= 40;
    }
    /**
     * END OF DECOMPOSE CONDITIONAL
     */    
}
