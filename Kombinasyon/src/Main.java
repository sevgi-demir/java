import java.util.Scanner;

/** 
Java ile kombinasyon hesaplayan program yazınız. 
*/

public class Main {
    public static void main(String[] args) {

        int n,r,sonuc,toplamn=1,toplamr=1,toplamnr=1;

        Scanner input=new Scanner(System.in);
        System.out.print("C(n,r) bicimindeki n degerini giriniz:");
        n= input.nextInt();
        System.out.print("C(n,r) bicimindeki r degerini giriniz:");
        r= input.nextInt();

        for(int i=1; i<=n; i++) {
            toplamn*=i;
        }
        for (int j = 1; j <=r ; j++) {
            toplamr*=j;
        }

        int fark=n-r;

        for (int k = 1; k <= fark ; k++) {
            toplamnr*=k;
        }

        sonuc=(toplamn / (toplamr * toplamnr));
        System.out.println("C(" + n + "," + r + ") = " + sonuc);

    }
}
