 import java.util.Scanner;

//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan program
 
public class Main {
    public static void main(String[] args) {
        int  min = 1, max = 1;
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n= input.nextInt();

        for(int i=1; i<=n; i++) {
        System.out.print(i + ".sayıyı giriniz: ");
        int sayi= input.nextInt();

            if(i==1) {
                max=sayi;
                min=sayi;
            }
            if(sayi>max) {
                max=sayi;
            }
            if(sayi<min) {
                min=sayi;
            }
        }
        System.out.println("En büyük sayi: " + max);
        System.out.println("En küçük sayi: " + min);

}}