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

    public static void IntroLetras(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {
            evt.consume();
        }
    }

    public static void IntroNumeros(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }

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
