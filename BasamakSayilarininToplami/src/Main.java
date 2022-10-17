import java.util.Scanner;

//Bir sayının basamak sayılarının toplamını hesaplayan program 

public class Main {
    public static void main(String[] args) {
        int a,basamakSayisi = 0, basamakToplam = 0, result = 0;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n= input.nextInt();
        System.out.print("Girdiğiniz sayının basamaklarının toplamı : ");

        while(n!=0) {
            basamakSayisi++;
            basamakToplam+= n%10;
            a=n%10;
            n/=10;
            System.out.print(a + "+");
        }
        System.out.println( "\b" +" = " + basamakToplam);
        System.out.print("Basamak Sayısı : " + basamakSayisi);

    }
}
