package com.cebe;
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args)
    {
        System.out.println("Eleman sayısını giriniz: ");
        int eleman=new Scanner(System.in).nextInt();
        //Kullanıcıdan kaç elemanlı dizi oluşturacağını istedim

        int sum1=0;
        int sum2=0;
        int i;

        for (i=0;i<=eleman-1;i++){
            System.out.print("Lütfen Dizi elemanı giriniz: ");
            int a=new Scanner(System.in).nextInt();
            if(a%2==0){
                sum1=sum1+a;
            }
            else{
                sum2=sum2+a;
            }
        }
        System.out.println("\nÇiftlerin toplamı: "+sum1);
        System.out.println("Teklerin toplamı: "+sum2);
    }

}
