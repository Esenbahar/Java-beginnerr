package Paket3;

import java.util.Scanner;

public class AltUcgen {

    public static void main(String args[]) {

        System.out.print("Kaç Sıra Olsun?");

        Scanner girilen = new Scanner(System.in);

        int sira = girilen.nextInt();

        for (int i =1; i <= sira; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }


}
