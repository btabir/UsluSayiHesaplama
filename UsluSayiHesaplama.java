package Hesaplamalar;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {

        /*int n,k;

        Scanner input=new Scanner(System.in);
        System.out.print("Ussu Alinacak Sayi :");
        n=input.nextInt();

        System.out.print("Us Olacak Sayi :");
        k=input.nextInt();

        int i=1;
        int total=1;

        while (i<=k){
            total*=n;
            i++;
        }
        System.out.println("Sonuc :"+total);

         */

        int n,k;
        int total=1;

        Scanner input=new Scanner(System.in);
        System.out.print("Ussu Alinacak Sayiyi Giriniz :");
        n=input.nextInt();

        System.out.print("Us Olacak Sayiyi Giriniz :");
        k=input.nextInt();

        for (int i=1; i<=k;i++){
            total*=n;

        }
        System.out.println("Sonucunuz :"+total);
    }
}
