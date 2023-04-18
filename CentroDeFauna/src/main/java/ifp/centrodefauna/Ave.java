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

    public Ave(String nombre, Date fechaEntrada, String especie, float peso, String tipoLesion, String gravedad, boolean cazaFurtiva) {
        super(nombre, "Ave", fechaEntrada, especie, peso, tipoLesion, gravedad);
        this.cazaFurtiva = cazaFurtiva;
    }

    // Getters y setters
    public boolean getCazaFurtiva() {
        return cazaFurtiva;
    }

    public void setCazaFurtiva(boolean cazaFurtiva) {
        this.cazaFurtiva = cazaFurtiva;
    }

    @Override
    public String datoExtra() {
        return this.cazaFurtiva ? "Caza furtiva" : "No caza";
    }
}
