/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad2_teoria_computacion;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Actividad2 {

    int n;
    String alfabeto[] = {"a", "b"};
    ArrayList<String> L = new ArrayList<>();

    public void algoritmo(int n) {
        this.n = n;
        L.add(String.valueOf((char) 955));
        for (int sizePalabra = 1; sizePalabra <= n; sizePalabra++) {
            sigma(0, sizePalabra, "");
        }
    }

    public void sigma(int posicion, int sizePalabra, String cadena) {
        if (cadena.length() == n) {
            L.add(cadena);
            return;
        }
        for (int i = posicion; i < alfabeto.length; i++) {
            String nuevaCadena = cadena + alfabeto[i];
            sigma(i, sizePalabra, nuevaCadena);
        }
    }
}
