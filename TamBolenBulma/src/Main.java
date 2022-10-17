//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, toplam=0, sayac=0;

        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        sayi= input.nextInt();

        for(int i=0; i<=sayi; i++) {
            if(i%3==0 && i%4==0) {
               toplam+=i;
               sayac++;
            }
        }
        double ort=toplam/sayac;
        System.out.println( "ortalama:" + ort);



    }
}
