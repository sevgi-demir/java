import java.util.Scanner;

//Java ile kullanıcının banka hesabını yönetebildiği bir ATM projesini  "Switch-Case" kullanarak yapan program

public class Main {
    public static void main(String[] args) {
       String userName, password;
       Scanner input=new Scanner(System.in);
       int select, miktar, girisHakki=3, bakiye=1500;

    do {
        System.out.print("Kullanıcı adını giriniz :");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();
           if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                    do {
                        System.out.println("1-Para yatırma\n" +
                           "2-Para Çekme\n" +
                           "3-Bakiye Sorgula\n" +
                           "4-Çıkış Yap");
                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                        select = input.nextInt();
                    switch (select) {
                       case 1:
                           System.out.print("Para miktarı: ");
                           miktar = input.nextInt();
                           bakiye += miktar;
                           break;
                       case 2:
                           System.out.print("Para miktarı : ");
                           miktar = input.nextInt();
                           if (miktar > bakiye) {
                               System.out.println("Bakiye yetersiz.");
                           } else {
                               bakiye -= miktar;
                           }
                           break;
                       case 3:
                           System.out.println("Bakiyeniz : " + bakiye);
                           break;
 }}
                       while (select != 4) ;
                            System.out.println("Tekrar görüşmek üzere.");
                       break;
                    } else {
                           girisHakki--;
                           System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                           if (girisHakki == 0) {
                               System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                           } else {
                               System.out.println("Kalan Hakkınız : " + girisHakki);
                           }
                      }

               } while (girisHakki > 0);
       }

    }


