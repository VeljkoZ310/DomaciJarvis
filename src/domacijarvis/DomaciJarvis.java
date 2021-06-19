/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domacijarvis;

import java.util.Scanner;

/**
 *
 * @author vzavi
 */
class Tacka {

    int x, y;
}

public class DomaciJarvis {
    
    

    public static Scanner sc = new Scanner(System.in);
    
    private boolean CCW(Tacka p, Tacka q, Tacka r){
        int rez = (q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y);
         if (rez >= 0)
             return false;
         return true;
    }

    public void ispisi(Tacka[] tacke, int[] sledeci) {
        System.out.println("\nIspis");
        for (int i = 0; i < sledeci.length; i++) {
            if (sledeci[i] != -1) {
                System.out.println("(" + tacke[i].x + ", " + tacke[i].y + ")");
            }
        }
    }

    public static void main(String[] args) {
        DomaciJarvis dj = new DomaciJarvis();
        int brTacaka = 8;
        System.out.println("Broj tacaka je 8:");
        Tacka[] tacke = new Tacka[brTacaka];
        for (int i = 0; i < tacke.length; i++) {
            tacke[i] = new Tacka();
            System.out.print("Unesi x koordinatu za " + i + " tacku:");
            tacke[i].x = sc.nextInt();
            System.out.println("");
            System.out.print("Unesi y koordinatu za " + i + " tacku:");
            tacke[i].y = sc.nextInt();
            System.out.println("");
        }
    }

}
