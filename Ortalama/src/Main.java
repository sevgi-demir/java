import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik,toplamNot=0,dersSayisi=0;

        Scanner input=new Scanner(System.in);

        System.out.print("matematik notunu giriniz:");
        mat= input.nextInt();
        if(!(mat<0 || mat>100 )) {
            toplamNot+=mat;
            dersSayisi++;
        }
        System.out.print("fizik notunu giriniz:");
        fizik= input.nextInt();
        if(!(fizik<0 || mat>100 )) {
            toplamNot+=fizik;
            dersSayisi++;
        }
        System.out.print("turkce notunu giriniz:");
        turkce= input.nextInt();
        if(!(turkce<0 || turkce>100 )) {
            toplamNot+=turkce;
            dersSayisi++;
        }
        System.out.print("kimya notunu giriniz:");
        kimya= input.nextInt();
        if(!(kimya<0 || kimya>100 )) {
            toplamNot+=kimya;
            dersSayisi++;
        }
        System.out.print("muzik notunu giriniz:");
        muzik= input.nextInt();
        if(!(muzik<0 || muzik>100 )) {
            toplamNot+=muzik;
            dersSayisi++;
        }

        double ort=toplamNot/dersSayisi;
        if(ort<=55) {
            System.out.println("sınıfta kaldınız, seneye tekrar görüşmek üzere");

        } else {
            System.out.println("tebrikler sınıfı geçtiniz");
        }
        System.out.print("ortalamanız:" + ort);

    }
}