package cz.spsmb.b3;
import java.util.Scanner;
public class Application {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Zadej hodnotu: ");
        int change= sc.nextInt();
        int[]iPole=new int[]{5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
         int place=0;
        while(change>0&& place< iPole.length)
        {
            if((change/iPole[place])>0) {
                int pocet=change/iPole[place];
                System.out.println( pocet+ "*" + iPole[place]);
                change-=pocet*iPole[place] ;
            }
            place++;
        }


    }
}