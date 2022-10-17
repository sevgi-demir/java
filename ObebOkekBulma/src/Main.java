import java.util.Scanner;

//Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazan program

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1= input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2= input.nextInt();

        int obeb=1;
        int i=n1;
        while(i>=1) {
            if(n1%i==0 && n2%i==0) {
                obeb=i;
                System.out.print(n1 + " ve " + n2 + " sayılarının obebi: "+ obeb);
                break;
            }
            i++;
        }
        System.out.println();

        int k=1;
        while(k<=(n1*n2)) {
            if(k%n1==0 && k%n2==0) {
                System.out.print(n1 + " ve " + n2 + " sayılarının okeki: "+ k);
                break;
            }
            k++;
        }




    }
}