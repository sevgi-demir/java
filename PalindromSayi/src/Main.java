import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    /**
     Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan program

     Palindrom Sayı Nedir ?
     Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

     Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
     */
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi= input.nextInt();
        System.out.println(isPalindrom(sayi));
    }
}