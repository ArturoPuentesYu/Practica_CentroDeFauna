/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifp.centrodefauna;

import java.util.Date;

/**
 *
 * @author Arturo
 */
public class Mamifero extends Animal {

    private boolean atropello;

    public Mamifero(String nombre, Date fechaEntrada, String especie, float peso, String tipoLesion, String gravedad, boolean atropello) {
        super(nombre, "Mamífero", fechaEntrada, especie, peso, tipoLesion, gravedad);
        this.atropello = atropello;
    }

    // Getters y setters
    public boolean getAtropello() {
        return atropello;
    }

    public void setAtropello(boolean atropello) {
        this.atropello = atropello;
    }

    @Override
    public String datoExtra() {
        return this.atropello ? "Atropellado" : "No Atropello";
    }
}
