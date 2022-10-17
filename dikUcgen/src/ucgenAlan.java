import java.util.Scanner;

public class ucgenAlan {
    public static void main(String[] args) {
        int a, b, c;
        double u, alan;
        Scanner input=new Scanner(System.in);
        System.out.println("a kenarını giriniz:");
        a= input.nextInt();
        System.out.println("b kenarını giriniz:");
        b= input.nextInt();
        System.out.println("c kenarını giriniz:");
        c= input.nextInt();

        u=(a+b+c)/2;
        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("üçgenin alanı:" + alan);




    }
}
