import java.util.Scanner;

//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan program

public class Main {
    public static void main(String[] args) {

        int n,k, toplam=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        n= input.nextInt();
        System.out.print("Üs olacak sayı: ");
        k= input.nextInt();

        for(int i=1; i<=k; i++) {
            toplam*=n;
        }
        System.out.print("Cevap: " + toplam);


    }
}