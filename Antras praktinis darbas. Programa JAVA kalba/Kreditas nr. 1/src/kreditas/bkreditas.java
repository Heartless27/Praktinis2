package kreditas;

public class bkreditas extends Kreditas { // Pull up field

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

        if (this.getIs() < 5000) {
            if (pa <= 50) {
                Ksum = this.kreditosuma(this.getK(), this.getL());
                Vimk = imokosAp(Ksum, this.getL());
                if (this.arSuteikiamasKreditas(Vimk)) { // DECOMPOSE CONDITIONAL
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

    /**
     * Pull up method pasalinamia metodus pasikartojancius metodus ir perkeliame
     * i super kalse
     */
}
