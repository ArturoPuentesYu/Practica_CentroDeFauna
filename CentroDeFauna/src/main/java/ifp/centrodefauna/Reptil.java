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
public class Reptil extends Animal {

    private boolean infeccionBacteriana;

    /**
     * Constructor que se utiliza para dar de alta al animal sin rellenar todos los datos del mismo
     * @param nombre
     * @param fechaEntrada
     * @param especie
     * @param peso
     * @param tipoLesion
     * @param gravedad
     * @param infeccionBacteriana
     */
    public Reptil(String nombre, Date fechaEntrada, String especie, float peso, String tipoLesion, String gravedad, boolean infeccionBacteriana) {
        super(nombre, "Reptil", fechaEntrada, especie, peso, tipoLesion, gravedad);
        this.infeccionBacteriana = infeccionBacteriana;
    }

    // Getters y setters

    /**
     *
     * @return
     */
    public boolean getInfeccionBacteriana() {
        return infeccionBacteriana;
    }

    /**
     *
     * @param infeccionBacteriana
     */
    public void setInfeccionBacteriana(boolean infeccionBacteriana) {
        this.infeccionBacteriana = infeccionBacteriana;
    }
    
    /**
     *
     * @return devuelve un string en función del booleano infeccionBacteriana
     */
    @Override
    public String datoExtra() {
        return this.infeccionBacteriana ? "Infec. bacteriana" : "No infec.";
    }
}
