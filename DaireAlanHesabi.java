package Giris;
import java.util.Scanner;

public class DaireAlanHesabi {

    public static  void main(String[] args){

        double 𝜋=3.14;
        int r;
        int 𝛼;

        Scanner input=new Scanner(System.in);

        System.out.print("Yarıçapı giriniz : ");
        r = input.nextInt();

        System.out.print("Merkez açısını giriniz : ");
        𝛼= input.nextInt();


        double cevre=2*𝜋*r;
        double alan=𝜋*r*r;
        double dilimAlan=(𝜋 * (r*r) * 𝛼) / 360;

        System.out.println("Dairenin çevresi:"+cevre);

        System.out.println("Dairenin alanı:"+alan);

        System.out.println("Dilimin alanı:"+dilimAlan);


    }


}
