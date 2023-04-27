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
public class Muerte {

    private String razon;
    private Date fecha;
    private String veterinario;

    /**
     * Constructor de la defunción de un animal
     * @param razon
     * @param fecha
     * @param veterinario
     */
    public Muerte(String razon, Date fecha, String veterinario) {
        this.razon = razon;
        this.fecha = fecha;
        this.veterinario = veterinario;
    }

    // Getters y setters

    /**
     *
     * @return
     */
    public String getRazon() {
        return razon;
    }

    /**
     *
     * @param razon
     */
    public void setRazon(String razon) {
        this.razon = razon;
    }

    /**
     *
     * @return
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     *
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     *
     * @return
     */
    public String getVeterinario() {
        return veterinario;
    }

    /**
     *
     * @param veterinario
     */
    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }
}
