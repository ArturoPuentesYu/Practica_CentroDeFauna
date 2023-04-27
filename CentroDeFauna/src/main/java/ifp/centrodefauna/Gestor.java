/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifp.centrodefauna;

import java.awt.event.KeyEvent;

/**
 *
 * @author Alumno
 */
public class Gestor {

    /**
     * Funcion que permite unicamente introducir letras
     * @param evt
     */
    public static void IntroLetras(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {
            evt.consume();
        }
    }

    /**
     * Funcion que solo permite introducir numeros
     * @param evt
     */
    public static void IntroNumeros(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }

    /**
     * funcion que permite el introducir numeros decimales
     * @param evt
     * @param num
     */
    public static void IntroDecimales(KeyEvent evt, String num) {
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        } else {
            try {
                Double.valueOf(num + c);
            } catch (NumberFormatException e) {
                evt.consume();
            }
        }
    }
}
