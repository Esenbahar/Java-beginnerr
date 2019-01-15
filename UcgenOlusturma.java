package Paket3;

import java.util.Scanner;

public class UcgenOlusturma {

    public static void main(String args[])
    {
        System.out.println("Sayı giriniz? ");
        Scanner inp = new Scanner(System.in);
        int sira = inp.nextInt();
       int c=2*sira-1;
        for (int i = sira; i>=1; i++)
        {
            for (int j=i; j>=1; j--)
            {
                System.out.print(" 2");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }

            for (int k=2; k<=i; k++)
            {
                System.out.print("2 ");
            }
            System.out.println("");
        }
    }
}
