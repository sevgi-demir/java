import java.util.Scanner;

//Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

public class Main {
    public static void main(String[] args) {
        int number,n1=0,n2=1,n3;

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        number = input.nextInt();


        for (int i = 2  ;i<=number; i++){
            n3=n1+n2;
            System.out.print(n1 + " + " +n2 + " = "+n3);
            n1=n2;
            n2=n3;
            System.out.println();
        }

    }
}