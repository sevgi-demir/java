import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int heat;

       Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık derecesi giriniz:");
        heat= input.nextInt();

        if(heat<=5) {
            System.out.println("kayak yapabilirsiniz");
        } else if(heat>5 && heat<=15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if(heat>=15 && heat<=25) {
            System.out.println("Pikniğe gidebilirsin.");
        } else if(heat>=25) {
            System.out.println("Yüzmeye gidebilirsin");
        }
    }
}