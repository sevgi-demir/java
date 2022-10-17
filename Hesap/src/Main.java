//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total=0;

        Scanner input=new Scanner(System.in);

        do{
            System.out.println("Bir sayı giriniz:");
            n= input.nextInt();
            if(n%2==0 && n%4==0) {
                total+=n;
            }
        } while (n%2!=1);

        System.out.println("Toplam:" + total);
    }
}