import java.util.Scanner;

/**
 * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazınız.
 */

public class Main {
    public static void main(String[] args) {

        int sayi;
        Scanner input=new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz:");
        sayi= input.nextInt();

        System.out.print(sayi + " sayısından küçük 4'ün kuvvetleri:");
        for (int i = 1; i <= sayi; i*=4) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.print(sayi + " sayısından küçük 5'in kuvvetleri:");
        for (int i = 1; i <= sayi; i*=5) {
            System.out.print(i + " ");
        }

    }
}