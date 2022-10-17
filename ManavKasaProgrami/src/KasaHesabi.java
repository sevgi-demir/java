import java.util.Scanner;

public class KasaHesabi {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00, sonuc;
        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        Scanner input=new Scanner(System.in);
        System.out.println("armut kaç kilo:");
        armutKg= input.nextInt();
        System.out.println("elma kaç kilo:");
        elmaKg= input.nextInt();
        System.out.println("domates kaç kilo:");
        domatesKg= input.nextInt();
        System.out.println("muz kaç kilo:");
        muzKg= input.nextInt();
        System.out.println("patlican kaç kilo:");
        patlicanKg= input.nextInt();

        sonuc=(armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);
        System.out.println("toplam tutar:" + sonuc);

    }
}
