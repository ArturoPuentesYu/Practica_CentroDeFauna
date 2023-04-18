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

    public Reptil(String nombre, Date fechaEntrada, String especie, float peso, String tipoLesion, String gravedad, boolean infeccionBacteriana) {
        super(nombre, "Reptil", fechaEntrada, especie, peso, tipoLesion, gravedad);
        this.infeccionBacteriana = infeccionBacteriana;
    }

    // Getters y setters
    public boolean getInfeccionBacteriana() {
        return infeccionBacteriana;
    }

    public void setInfeccionBacteriana(boolean infeccionBacteriana) {
        this.infeccionBacteriana = infeccionBacteriana;
    }
    
    @Override
    public String datoExtra() {
        return this.infeccionBacteriana ? "Infec. bacteriana" : "No infec.";
    }
}
