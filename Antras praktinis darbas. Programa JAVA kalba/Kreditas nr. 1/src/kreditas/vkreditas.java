package kreditas;

public class vkreditas extends Kreditas {   //Pull up field

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

        if (this.getIs() < 15000) {
            if (this.getK() >= 300 && this.getK() <= 260000) {
                if (this.getL() <= 5) {
                    Ksum = kreditosuma(this.getK(), this.getL());
                    Vimk = imokosAp(Ksum, this.getL());
                    if (this.arSuteikiamasKreditas(Vimk)) {   // DECOMPOSE CONDITIONAL
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

    /**
     * Pull up method pasalinamia metodus pasikartojancius metodus ir perkeliame
     * i super kalse
     */
}
