import java.util.Scanner;

public class Alan {
    public static void main(String[] args) {
        int r, a;
        double pi=3.14, alan;

        Scanner input=new Scanner(System.in);
        System.out.println("yarıçapı giriniz:");
        r= input.nextInt();
        System.out.println("merkez açısını giriniz:");
        a= input.nextInt();

        alan=(pi*(r*r)*a)/360;
        System.out.println("alan:" + alan);



    }
}
