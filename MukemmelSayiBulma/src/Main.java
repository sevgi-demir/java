import java.util.Scanner;

/**
 * Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
 * değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan program.
 * Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
 */

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int toplam=0;
        System.out.print("Bir sayi giriniz: ");
        int sayi= input.nextInt();

        for(int i=(sayi-1); i>=1; i--) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
            if(toplam==sayi) {
            System.out.println("Sayınız bir mükemmel sayıdır.");

            } else {
                System.out.println( "Sayınız bir mükemmel sayı değildir.");

            }
        }
}
