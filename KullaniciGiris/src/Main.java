import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password,answer, password2;

        Scanner input=new Scanner(System.in);
        System.out.println("Kullanıcı adınız:");
        userName= input.nextLine();
        System.out.println("şifreniz:");
        password= input.nextLine();

        if(userName.equals("patika") && password.equals("java123")) {
            System.out.println("giriş yapıldı");
        } else  {
            System.out.println("şifrenizi sıfırlamak ister misiniz?");
            answer= input.nextLine();
            if(answer.equals("evet")) {
                System.out.println("yeni şifrenizi giriniz:");
                password2= input.nextLine();
                if(password2.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("şifre oluşturuldu");
                }


            } else  if(answer.equals("hayır")) {
                System.out.println("tekrar deneyiniz");


            }
        }

    }
}