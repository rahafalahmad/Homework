package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int elma;
        int armut;
        int kiraz;
        int a, b, c = 0;

        System.out.print("Elma miktarını girin: ");
            elma = input.nextInt();

        System.out.print("Armut miktarını girin: ");
            armut = input.nextInt();

        System.out.print("Kiraz miktarını girin: ");
            kiraz = input.nextInt();

        System.out.println(" Lütfen istediğiniz elma, armut veya kiraz miktarını kilogram olarak giriniz: ");

        System.out.print("Elma miktarını girin: ");
            a = input.nextInt();
            elma -= a;

        System.out.print("Armut miktarını girin:");
            b = input.nextInt();
            armut -= b;

        System.out.print("Kiraz miktarını girin:");
            c = input.nextInt();
            kiraz -= c;
        if (elma < 0 )
                System.out.println("\n"+"Mağazada gerekli miktarda elma yok");
        else
                System.out.println("elma miktarı = " + elma);
        if (armut < 0 )
                System.out.println("\n"+"Mağazada gerekli miktarda armut yok");
        else
                System.out.println("armut miktarı = " + armut);
        if (kiraz < 0 )
                System.out.println("\n"+"Mağazada gerekli miktarda kiraz yok");
        else
                System.out.println("kiraz miktarı = " + armut);
    }
}

