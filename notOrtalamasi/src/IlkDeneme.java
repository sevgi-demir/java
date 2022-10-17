import java.util.Scanner;

public class IlkDeneme {
    public static void main(String[] args) {
        int fizik, kimya, turkce, tarih, muzik;             //not ortalaması hesaplayan program
        Scanner input=new Scanner(System.in);
        System.out.println("fizik notunu giriniz:");
        fizik= input.nextInt();
        System.out.println("kimya notunu giriniz:");
        kimya= input.nextInt();
        System.out.println("turkce notunu giriniz:");
        turkce= input.nextInt();
        System.out.println("tarih notunu giriniz:");
        tarih= input.nextInt();
        System.out.println("muzik notunu giriniz:");
        muzik= input.nextInt();
        double ort=(fizik+kimya+turkce+tarih+muzik)/5;
        System.out.println(ort );
        if (ort<=50) {
            System.out.println("kaldı");
        } else {
            System.out.println("geçti");
        }


    }
}


