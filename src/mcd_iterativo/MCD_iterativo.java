/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mcd_iterativo;

import java.util.Scanner;

/**
 *
 * @author trini
 */
public class MCD_iterativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();
        
        int mcd = encontrarMCD(num1, num2);
        
        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + mcd);
    }
    
    public static int encontrarMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
