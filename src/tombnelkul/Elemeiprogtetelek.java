/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombnelkul;

import java.util.Scanner;

/**
 *
 * @author KovácsGábor(SZOFT_20
 */
public class Elemeiprogtetelek {
    
    
 
    static Scanner sc = new Scanner(System.in);
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = -1;
        while(n < 0) {
            System.out.println("N= ");
            n = sc.nextInt();
        }
        int ossz = 0;
        for(int i=0; i<n+1; i++) {
            ossz += i;
        }
        
        System.out.printf("Az első %d szám összege: %d\n",n,ossz);
        
        
        //megszamlalas tétele
        int db = 0;
        for(int i=10; i<100; i++) {
            if(i % 2 == 0) {
                db++;            
            }
        }
        System.out.printf("10-100-ig a kétjegyű páros számok összege: %d\n", db);
        
        //minimum kiválasztás tétele
        int VEGE = 0;
        db = 0;
        int min =  Integer.MAX_VALUE; //2147483647;
        int szam;
        VEGE = -1;
        System.out.println("0-ra kilép: ");
        while ((szam = sc.nextInt()) != VEGE) {
        {
            if(szam < min){
                min = szam;
            }
            db++;
        }
        System.out.printf("%d számból a legkisebb: %d",db,min);
    }
    //eldöntés tétele
        System.out.print("szám");
        n = sc.nextInt();
        boolean prim;
        
        if(n<2) {
            prim = false;
        }
        else{
            int i = 2;
            while( i<= Math.sqrt(n) && n % i !=0) {
            i++;
        }
            prim = i > Math.sqrt(n);
    }
        if(prim == true){
            System.out.println("Prím");
        }
        else{
            System.out.println("Nem prím");
        }
        }//main vége
    }//class vége

