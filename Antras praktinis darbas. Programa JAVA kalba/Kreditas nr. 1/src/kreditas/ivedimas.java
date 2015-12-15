package kreditas;

import java.util.Scanner;

public class ivedimas {
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		vkreditas VartClass = new vkreditas();
		bkreditas BustClass = new bkreditas();
		double Pajamos, PajamosB, skolos, Ksuma; // ivedimo
		int variantas, Svaiku, pam, laik;// ivedimo
		
		int sumavaik = 100;
		System.out.println(" ");
		System.out.println("Pasirinkite kredità: "
				+ "Bûsto Kreditas - 1" + " "
				+ "Vartojamasis Kreditas - 2");
		variantas = scan.nextInt();
		
		
		if(variantas <= 2){ 
			if (variantas==2){
				System.out.println("Áveskite vaikø skaièiu nuo 0 iki 10 :");
				Svaiku = scan.nextInt();
				System.out.println("Áveskite pajamas atskaièiavus mokesèius:");
				Pajamos = scan.nextDouble();
				System.out.println("Áveskite ásiskolinimø skaièiø:");
				skolos = scan.nextDouble();
				System.out.println("Áveskite kredito laikotarpi iki 5 metø:");
				laik = scan.nextInt();
				System.out.println("Áveskite kredito suma nuo 300 Eu iki 26000 Eu: ");
				Ksuma = scan.nextDouble();
				PajamosB=Pajamos-skolos-(Svaiku*sumavaik);
				VartClass.setDuom(PajamosB, Ksuma, laik, laik);
				VartClass.kreditas();
				}
			else {	
				System.out.println("Áveskite vaikø skaiciu nuo 0 iki 10 :");
				Svaiku = scan.nextInt();
				System.out.println("Áveskite pajamas atskaièiavus mokesèius:");
				Pajamos = scan.nextDouble();
				System.out.println("Áveskite ásiskolinimø skaièiø: ");
				skolos = scan.nextDouble();
				System.out.println("Áveskite pastato amþiø: ");
				pam = scan.nextInt();
				System.out.println("Áveskite kredito laikotarpá: ");
				laik = scan.nextInt();
				System.out.println("áveskite kredito sumà: ");
				Ksuma = scan.nextDouble();
				PajamosB=Pajamos-skolos-(Svaiku*sumavaik);
				BustClass.setDuom(PajamosB, Ksuma, laik, skolos, pam);
				BustClass.kreditas();
			}
		}
		else System.out.println("Neteisingas parinktas parametras!");
	
	}
}
		

	


