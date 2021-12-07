/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author immque
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        float temperatura;
        
        System.out.println("Welcome!!!");
        
        System.out.print("Indica la temperatura: ");
        temperatura = lector.nextFloat();
        
        if (temperatura < 0) {
            System.out.println(temperatura + " grados es una temperatura negativa");
        }
        else {
            System.out.println(temperatura + " grados es una temperatura positiva");
        }
    }
}
