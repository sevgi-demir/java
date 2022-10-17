import java.util.Scanner;

/** Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*)
 * ile ekrana ters üçgen çizen program
 */

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = n; i >0  ; i--) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = (2*i)-1; k>0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
