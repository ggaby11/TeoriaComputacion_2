/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.actividad2_teoria_computacion;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Actividad2_main {

    public static void main(String[] args) {
        Actividad2 a2 = new Actividad2();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese n =");
        int n = sc.nextInt();
        a2.algoritmo(n);
        
        System.out.println(a2.L.toString());
    }
}
