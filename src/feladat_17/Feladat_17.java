
package feladat_17;

import java.util.Scanner;


public class Feladat_17 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int[] tomb = new int[5];
        for( int i = 0; i < tomb.length; i++ )
        {
                tomb[i] = (int)(Math.random()*100)+1;
        }
        for( int i = 0; i < tomb.length; i++ )
        {
                System.out.print(tomb[i]+" ");
        }
        System.out.println();
        int[] tomb2 = new int[5];
        for( int i = 0; i < tomb2.length; i++ )
        {
                tomb2[i] = (int)(Math.random()*100)+1;
        }
        for( int i = 0; i < tomb2.length; i++ )
        {
                System.out.print(tomb2[i]+" ");
        }
        System.out.println();
        int[] tomb3 = new int[5];
        for (int i = 0; i < tomb3.length; i++) {
            tomb3[i]= tomb[i] + tomb2[i];
            System.out.print(tomb3[i]+" ");
        }
    }
    
}
