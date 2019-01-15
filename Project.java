package Paket1;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Project {
    public static void main(String args[])
    {
        String girilen,tersten= "";
    Scanner in =new Scanner (System.in);
       System.out.println("Kelime Giriniz.");

       girilen=in.nextLine();
        int length=girilen.length();

        for(int i=0; i<=length-1;i++)
        {
            tersten+=girilen.charAt(length-1-i);

        }
        if(girilen.equals(tersten))
        {
            System.out.println("palindromik kelime");

        }
        else
        {
            System.out.println("palindromik kelime değil");
        }

    }
}
