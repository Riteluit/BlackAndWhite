/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.util.Scanner;
import mundo.BlackNWhite;

public class InterfazApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inic = 0;

        BlackNWhite blacknwhite;

        String pos[];

        pos = new String[7];

        pos[0] = "B";
        pos[1] = "B";
        pos[2] = "B";
        pos[3] = "-";
        pos[4] = "W";
        pos[5] = "W";
        pos[6] = "W";

        blacknwhite = new BlackNWhite(3, pos);
        System.out.print("Posicion inicial: ");blacknwhite.ver();

        do {
            switch (inic) {
                case 0:
                    System.out.println("\nMenu \n 1. Mover a la izquierda. \n 2. Mover a la derecha \n 3. Doblesalto a la izquierda \n 4. Doblesalto a la Derecha \n 5. Salir");
                    System.out.print("Digite la opcion: ");inic = sc.nextInt();
                    break;
                case 1:
                    blacknwhite.saltoIzquierda();
                    blacknwhite.ver();
                    inic = 0;
                    break;
                case 2:
                    blacknwhite.saltoDerecha();
                    blacknwhite.ver();
                    inic = 0;
                    break;
                case 3:
                    blacknwhite.doblesaltoIzquierda();
                    blacknwhite.ver();
                    inic = 0;
                    break;
                case 4:
                    blacknwhite.doblesaltoDerecha();
                    blacknwhite.ver();
                    inic = 0;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    inic = 0;
            }
        } while (inic != 5);
    }
}
