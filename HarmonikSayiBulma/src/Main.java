import java.util.Scanner;

//Java ile girilen sayının harmonik serisini bulan program yazacağız.

public class Main {
    public static void main(String[] args) {
        double sonuc=0;
        Scanner input=new Scanner(System.in);
        System.out.print("N sayısını giriniz:");
        int n = input.nextInt();

        for(double i=1; i<=n; i++) {
            sonuc+=(1/i);
        }
        System.out.print(n + " sayısının harmonik ortalaması: " + sonuc);
    }
}