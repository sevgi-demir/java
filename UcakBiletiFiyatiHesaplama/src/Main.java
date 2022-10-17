import java.util.Scanner;

/** Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
  Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
  İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

 Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
 Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
 Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
 Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
 Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
 Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır */

public class Main {
    public static void main(String[] args) {
        double mesafeBasinaUcret=0.10, ucret, yasIndirimi, IndirimliTutar, GidisDonusBiletIndirimi, ToplamTutar;
        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        int mesafe= input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        int yas= input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int tip= input.nextInt();

        if(mesafe>0 && yas>0) {
            if(tip==1 || tip==2) {
                ucret= mesafe * mesafeBasinaUcret;
                if(yas<12) {
                    switch (tip) {
                        case 1:
                            yasIndirimi= ucret * 0.50;
                            IndirimliTutar= ucret-yasIndirimi;
                            System.out.print("Toplam tutar: " + IndirimliTutar);
                            break;
                        case 2:
                            yasIndirimi= ucret * 0.50;
                            IndirimliTutar= ucret-yasIndirimi;
                            GidisDonusBiletIndirimi=IndirimliTutar*0.20;
                            ToplamTutar=(IndirimliTutar-GidisDonusBiletIndirimi)*2;
                            System.out.print("Toplam tutar: " + ToplamTutar);
                            break;
                    }
                }
                else if(yas>=12 && yas<=24) {
                    switch (tip) {
                        case 1:
                            yasIndirimi= ucret * 0.10;
                            IndirimliTutar= ucret-yasIndirimi;
                            System.out.print("Toplam tutar: " + IndirimliTutar);
                            break;
                        case 2:
                            yasIndirimi= ucret * 0.10;
                            IndirimliTutar= ucret-yasIndirimi;
                            GidisDonusBiletIndirimi=IndirimliTutar*0.20;
                            ToplamTutar=(IndirimliTutar-GidisDonusBiletIndirimi)*2;
                            System.out.print("Toplam tutar: " + ToplamTutar);
                            break;
                    }
                }
                else if(yas>65) {
                    switch (tip) {
                        case 1:
                            yasIndirimi= ucret * 0.30;
                            IndirimliTutar= ucret-yasIndirimi;
                            System.out.print("Toplam tutar: " + IndirimliTutar);
                            break;
                        case 2:
                            yasIndirimi= ucret * 0.30;
                            IndirimliTutar= ucret-yasIndirimi;
                            GidisDonusBiletIndirimi=IndirimliTutar*0.20;
                            ToplamTutar=(IndirimliTutar-GidisDonusBiletIndirimi)*2;
                            System.out.print("Toplam tutar: " + ToplamTutar);
                            break;
                        default:
                            System.out.print("Hatalı veri girdiniz!");
                    }
                }
                else if (tip==1) {
                    System.out.print("Toplam tutar: " + ucret);
                } else if(tip==2) {
                    GidisDonusBiletIndirimi= ucret * 0.20;
                    System.out.print("Toplam tutar: " + GidisDonusBiletIndirimi);
                }
            } else System.out.println("Hatalı veri girdiniz!");
        } else System.out.println("Hatalı veri girdiniz!");


    }
}