//Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran program

public class Main {
    public static void main(String[] args) {
        int  sayac;

        for(int i = 1; i < 100; i++) {
            sayac = 0;
            for (int j = 2; j <= i/2; j++) {
                if(i % j == 0) {
                    sayac++;

                }
            }
            if(sayac == 0 && i != 1 ) {
                System.out.print( " " + i);
            }
        }

    }
}