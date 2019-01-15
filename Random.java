package Paket2;
//0 ile 1000 arasında random bir sayı oluşturarak bu sayının rakamları
// toplamını veren java algoritma kodunu yazınız ?
public class Random {
    public static void main(String args[])
    {

   int randomSayi=(int)(Math.random()*(1000));

   System.out.println("random sayi ->"+randomSayi  );
   int bilerbasamağı=randomSayi %10;
     randomSayi=randomSayi /10;
      int onlar= randomSayi %10;

      int yuzler=randomSayi/10;

      System.out.println("toplamları="+(bilerbasamağı+onlar+yuzler));

    }
}
