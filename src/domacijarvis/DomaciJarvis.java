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

    public static void main(String[] args) {
        DomaciJarvis dj = new DomaciJarvis();
        int brTacaka=8;
        System.out.println("Broj tacaka je 8:");
        Tacka[] tacke= new Tacka[brTacaka];
        for (int i = 0; i < tacke.length; i++) {
            tacke[i]=new Tacka();
            System.out.print("Unesi x koordinatu za "+i+" tacku:");
            tacke[i].x=sc.nextInt();
            System.out.println("");
            System.out.print("Unesi y koordinatu za "+i+" tacku:");
            tacke[i].y=sc.nextInt();
            System.out.println("");
        }
    }

}
