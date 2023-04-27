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

    /**
     * Constructor que se utiliza para dar de alta al animal sin rellenar todos los datos del mismo
     * @param nombre
     * @param fechaEntrada
     * @param especie
     * @param peso
     * @param tipoLesion
     * @param gravedad
     * @param atropello
     */
    public Mamifero(String nombre, Date fechaEntrada, String especie, float peso, String tipoLesion, String gravedad, boolean atropello) {
        super(nombre, "Mamífero", fechaEntrada, especie, peso, tipoLesion, gravedad);
        this.atropello = atropello;
    }

    // Getters y setters

    /**
     *
     * @return
     */
    public boolean getAtropello() {
        return atropello;
    }

    /**
     *
     * @param atropello
     */
    public void setAtropello(boolean atropello) {
        this.atropello = atropello;
    }

    /**
     *
     * @return devuelve un string en función del booleano atropello
     */
    @Override
    public String datoExtra() {
        return this.atropello ? "Atropellado" : "No Atropello";
    }
}
