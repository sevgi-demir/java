import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dogumYili;

        Scanner input=new Scanner(System.in);
        System.out.print("Doğum yılınızı girin:");
        dogumYili= input.nextInt();
        int kalan=dogumYili%12;
        if(kalan==0) {
            System.out.print("Çin zodyağu burcunuz: Maymun" );
        } else if (kalan==1) {
            System.out.println("Çin zodyağu burcunuz: Horoz");
        } else if (kalan==2) {
            System.out.println("Çin zodyağu burcunuz: Köpek");
        } else if (kalan==3) {
            System.out.println("Çin zodyağu burcunuz: Domuz");
        } else if (kalan==4) {
            System.out.println("Çin zodyağu burcunuz: Fare");
        } else if (kalan==5) {
            System.out.println("Çin zodyağu burcunuz: Öküz");
        } else if (kalan==6) {
            System.out.println("Çin zodyağu burcunuz: Kaplan");
        } else if (kalan==7) {
            System.out.println("Çin zodyağu burcunuz: Tavşan");
        } else if (kalan==8) {
            System.out.println("Çin zodyağu burcunuz: Ejderha");
        } else if (kalan==9) {
            System.out.println("Çin zodyağu burcunuz: Yılan");
        } else if (kalan==10) {
            System.out.println("Çin zodyağu burcunuz: At");
        } else if (kalan==11) {
            System.out.println("Çin zodyağu burcunuz: Koyun");



    }
}}
