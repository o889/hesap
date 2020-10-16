package com.turan;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sayigirdi=new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
	int deger1=sayigirdi.nextInt();
        System.out.println("2.sayıyı giriniz");
	int deger2=sayigirdi.nextInt();

	int toplamdeger=deger1+deger2;
	int farkdeger=deger1-deger2;
    int carpimdeger=deger1*deger2;
    float bolumdeger=deger1/deger2;

        System.out.println("Toplam: "+toplamdeger);
        System.out.println("Fark: "+farkdeger);
        System.out.println("Çarpım: "+carpimdeger);
        System.out.println("Bolum: "+bolumdeger);
    }
}
