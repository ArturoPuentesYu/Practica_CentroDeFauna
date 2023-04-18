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
public class Liberacion {

    private String detalles;
    private Date fecha;
    private String veterinario;

    public Liberacion(String detalles, Date fecha, String veterinario) {
        this.detalles = detalles;
        this.fecha = fecha;
        this.veterinario = veterinario;
    }

    Liberacion() {
    }

    // Getters y setters
    public String getRazon() {
        return detalles;
    }

    public void setRazon(String razon) {
        this.detalles = razon;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }
}
