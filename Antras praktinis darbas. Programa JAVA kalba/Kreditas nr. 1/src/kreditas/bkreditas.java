package kreditas;

public class bkreditas extends Kreditas { // Pull up field

// private double a, k, l, is; // Pull up field
    private double pa;

    public bkreditas(double a, double k, double l, double is, double pa) {
        super(a, k, l, is);
        this.pa = pa;
    }

    /*
     * Default Constructor
     */
    public bkreditas() {
        super(0, 0, 0, 0);
        this.pa = 0;
    }

    
    public void kreditas() {

        double Vimk, Ksum; //papildomi kintamieji

        if (is < 5000) {
            if (pa <= 50) {
                Ksum = kreditosuma(k, l);
                Vimk = imokosAp(Ksum, l);
                if (((Vimk / a) * 100) <= 40) {
                    System.out.println("Kredit� suteikti galima!" + " "
                            + "Viso gra�inti reik�s: " + Ksum + " "
                            + "Men�sin� �moka bus: " + Vimk);
                } else {
                    System.out.println("Kredito suteikti negalime! ");
                }
            } else {
                System.out.println("Kredito suteikti negalime! Pastatas Persenas!");
            }
        } else {
            System.out.println("Kredito suteikti negalime! J�s� �siskolinimai per dideli");
        }

    }

    private double kreditosuma(double k, double l) {
        double p = 0.04; //metine palukanu norma 4%
        return k + (k * l * p);
    }

    private double imokosAp(double K, double l) {
        return k / (l * 12); // imokos apskaiciavimas
    }
}
