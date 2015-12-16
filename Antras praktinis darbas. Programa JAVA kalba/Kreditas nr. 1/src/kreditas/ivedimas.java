package kreditas;

import java.util.Scanner;

public class ivedimas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        vkreditas VartClass;
        bkreditas BustClass;
        double Pajamos, PajamosB, skolos, Ksuma; // ivedimo
        int variantas, Svaiku, pam, laik;// ivedimo

        int sumavaik = 100;
        System.out.println(" ");
        System.out.println("Pasirinkite kredit�: "
                + "B�sto Kreditas - 1" + " "
                + "Vartojamasis Kreditas - 2");
        variantas = scan.nextInt();

        if (variantas <= 2) {
            if (variantas == 2) {
                System.out.println("�veskite vaik� skai�iu nuo 0 iki 10 :");
                Svaiku = scan.nextInt();
                System.out.println("�veskite pajamas atskai�iavus mokes�ius:");
                Pajamos = scan.nextDouble();
                System.out.println("�veskite �siskolinim� skai�i�:");
                skolos = scan.nextDouble();
                System.out.println("�veskite kredito laikotarpi iki 5 met�:");
                laik = scan.nextInt();
                System.out.println("�veskite kredito suma nuo 300 Eu iki 26000 Eu: ");
                Ksuma = scan.nextDouble();
                PajamosB = Pajamos - skolos - (Svaiku * sumavaik);
                VartClass = new vkreditas(PajamosB, Ksuma, laik, laik);
                VartClass.kreditas();
            } else {
                System.out.println("�veskite vaik� skaiciu nuo 0 iki 10 :");
                Svaiku = scan.nextInt();
                System.out.println("�veskite pajamas atskai�iavus mokes�ius:");
                Pajamos = scan.nextDouble();
                System.out.println("�veskite �siskolinim� skai�i�: ");
                skolos = scan.nextDouble();
                System.out.println("�veskite pastato am�i�: ");
                pam = scan.nextInt();
                System.out.println("�veskite kredito laikotarp�: ");
                laik = scan.nextInt();
                System.out.println("�veskite kredito sum�: ");
                Ksuma = scan.nextDouble();
                PajamosB = Pajamos - skolos - (Svaiku * sumavaik);
                BustClass = new bkreditas(PajamosB, Ksuma, laik, skolos, pam);
                BustClass.kreditas();
            }
        } else {
            System.out.println("Neteisingas parinktas parametras!");
        }

    }
}
