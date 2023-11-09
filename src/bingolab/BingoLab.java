/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bingolab;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cande
 */
public class BingoLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int c1, c2, c3, c4, c5, c6, c7, c8, c9;
        int num, op;
        System.out.println("$ $ $ % % % % % !BIENVENIDO AL BINGO! % % % % % $ $ $");
        System.out.println("\n-Nuevo Juego- \n\nEsta es tu cartilla\n");
        c1 = rand.nextInt(9) + 1;

        do {
            c2 = rand.nextInt(9) + 1;
        } while (c2 == c1);

        do {
            c3 = rand.nextInt(9) + 1;
        } while (c3 == c2 | c3 == c1);

        do {
            c4 = rand.nextInt(9) + 1;
        } while (c4 == c3 | c4 == c2 | c4 == c1);

        do {
            c5 = rand.nextInt(9) + 1;
        } while (c5 == c4 | c5 == c3 | c5 == c2 | c5 == c1);

        do {
            c6 = rand.nextInt(9) + 1;
        } while (c6 == c5 | c6 == c4 | c6 == c3 | c6 == c2 | c6 == c1);

        do {
            c7 = rand.nextInt(9) + 1;
        } while (c7 == c6 | c7 == c5 | c7 == c4 | c7 == c3 | c7 == c2 | c7 == c1);

        do {
            c8 = rand.nextInt(9) + 1;
        } while (c8 == c7 | c8 == c6 | c8 == c5 | c8 == c4 | c8 == c3 | c8 == c2 | c8 == c1);

        do {
            c9 = rand.nextInt(9) + 1;
        } while (c9 == c8 | c9 == c7 | c9 == c6 | c9 == c5 | c9 == c4 | c9 == c3 | c9 == c2 | c9 == c1);

        System.out.println(c1 + " | " + c2 + " | " + c3);
        System.out.println("---------");
        System.out.println(c4 + " | " + c5 + " | " + c6);
        System.out.println("---------");
        System.out.println(c7 + " | " + c8 + " | " + c9);

        for (int i = 0; i <= 7; i++) {
            System.out.println("\nDesea recibir un numero?\n 1. Si \n 2. No");
            op = input.nextInt();
            if (op == 1) {
                num = rand.nextInt(9) + 1;
                System.out.println("\n\nNUMERO RECIBIDO: " + num);
                if (num == c1) {
                    c1 = 0;
                } else if (num == c2) {
                    c2 = 0;
                } else if (num == c3) {
                    c3 = 0;
                } else if (num == c4) {
                    c4 = 0;
                } else if (num == c5) {
                    c5 = 0;
                } else if (num == c6) {
                    c6 = 0;
                } else if (num == c7) {
                    c7 = 0;
                } else if (num == c8) {
                    c8 = 0;
                } else if (num == c9) {
                    c9 = 0;
                } else {
                    System.out.println("Este numero ya fue marcado!");
                }
                System.out.println("---------------\n\n\n");
                System.out.println(c1 + " | " + c2 + " | " + c3);
                System.out.println("---------");
                System.out.println(c4 + " | " + c5 + " | " + c6);
                System.out.println("---------");
                System.out.println(c7 + " | " + c8 + " | " + c9);
                System.out.println("\n\n\n---------------");

                if (i >= 3) {
                    //Ganar horizontalmente
                    if (c1 == c2 & c2 == c3) {
                        System.out.println("\n\n!!! ### ### GANASTE! ### ### !!!");
                        i = 8;
                    } else if (c4 == c5 & c5 == c6) {
                        System.out.println("\n\n!!! ### ### GANASTE! ### ### !!!");
                        i = 8;
                    } else if (c7 == c8 & c8 == c9) {
                        System.out.println("\n\n!!! ### ### GANASTE! ### ### !!!");
                        i = 8;
                    } //Ganar verticalmente
                    else if (c1 == c4 & c4 == c7) {
                        System.out.println("\n\n!!! ### ### GANASTE! ### ### !!!");
                        i = 8;
                    } else if (c2 == c5 & c5 == c8) {
                        System.out.println("\n\n!!! ### ### GANASTE! ### ### !!!");
                        i = 8;
                    } else if (c3 == c6 & c6 == c9) {
                        System.out.println("\n\n!!! ### ### GANASTE! ### ### !!!");
                        i = 8;
                    }
                    else if( i == 7){
                        System.out.println("PERDISTE...\n;(");
                    }
                }

            } else {
                System.out.println("Quieres salir de la aplicacion? \n 1. Si \n 2. No");
                if (input.nextInt() == 1) {
                    System.out.println("Hasta luego!");
                    i = 8;
                }
            }
        }
    }
}
