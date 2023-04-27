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
public class Ave extends Animal {

    private boolean cazaFurtiva;

    /**
     *  Constructor que se utiliza para dar de alta al animal sin rellenar todos los datos del mismo
     * @param nombre
     * @param fechaEntrada
     * @param especie
     * @param peso
     * @param tipoLesion
     * @param gravedad
     * @param cazaFurtiva
     */
    public Ave(String nombre, Date fechaEntrada, String especie, float peso, String tipoLesion, String gravedad, boolean cazaFurtiva) {
        super(nombre, "Ave", fechaEntrada, especie, peso, tipoLesion, gravedad);
        this.cazaFurtiva = cazaFurtiva;
    }

    // Getters y setters

    /**
     *
     * @return devuelve el valor de cazaFurtiva
     */
    public boolean getCazaFurtiva() {
        return cazaFurtiva;
    }

    /**
     *
     * @param cazaFurtiva cambia el booleano cazaFurtiva
     */
    public void setCazaFurtiva(boolean cazaFurtiva) {
        this.cazaFurtiva = cazaFurtiva;
    }

    /**
     *
     * @return devuelve un string en función del booleano cazaFurtiva
     */
    @Override
    public String datoExtra() {
        return this.cazaFurtiva ? "Caza furtiva" : "No caza";
    }
}
