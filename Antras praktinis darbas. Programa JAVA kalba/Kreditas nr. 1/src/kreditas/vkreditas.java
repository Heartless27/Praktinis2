package kreditas;

public class vkreditas extends Kreditas {   //Pull up field

    
     //  private double a, k, l, is; // Pull up field
    
    public vkreditas(double a, double k, double l, double is) {
        super(a, k, l, is);
    }

    /*
     * Default Constructor
     */
    public vkreditas() {
        super(0, 0, 0, 0);
    }
   

   

    public void kreditas() {

        double Vimk, Ksum; //papildomi kintamieji, taip pat palukanu norma

        if (is < 15000) {
            if (k >= 300 && k <= 260000) {
                if (l <= 5) {
                    Ksum = kreditosuma(k, l);
                    Vimk = imokosAp(Ksum, l);
                    if (((Vimk / a) * 100) <= 40) {
                        System.out.println("Kredit� suteikti galima!" + " "
                                + "Viso gra�inti reik�s: " + Ksum + " "
                                + "Men�sine �moka bus: " + Vimk);
                    } else {
                        System.out.println("Kredito suteikti negalime! ");
                    }
                } else {
                    System.out.println("Kredito suteikti negalime! Perilgas terminas!");
                }
            } else {
                System.out.println("Kredito suteikti negalime! Pra�oma suma yra perma�a arba per didel�!");
            }
        } else {
            System.out.println("Kredito suteikti negalime! Jusu �siskolinimai per dideli");
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
