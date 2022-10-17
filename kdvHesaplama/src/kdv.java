import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18, kdvOran2=0.8, kdvTutar, kdvliTutar;

        Scanner input=new Scanner(System.in);
        System.out.println("ücret tutarını giriniz:");
        tutar= input.nextDouble();

        if(tutar>=0 && tutar<=1000) {

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar+ kdvTutar;

        System.out.println("KDV'siz tutar:" + tutar);
        System.out.println("KDV oranı:" + kdvOran);
        System.out.println("KDV Tutarı:" + kdvTutar);
        System.out.println("KDV'li tutar:" + kdvliTutar);

    }   else{
            kdvTutar = tutar * kdvOran2;
            kdvliTutar = tutar+ kdvTutar;

            System.out.println("KDV'siz tutar:" + tutar);
            System.out.println("KDV oranı:" + kdvOran2);
            System.out.println("KDV Tutarı:" + kdvTutar);
            System.out.println("KDV'li tutar:" + kdvliTutar);

        }
    }
}
