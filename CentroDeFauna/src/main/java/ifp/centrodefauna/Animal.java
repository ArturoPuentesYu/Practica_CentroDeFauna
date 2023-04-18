/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifp.centrodefauna;

import java.util.Date;

/**
 *
 * @author ajpyu
 */
public abstract class Animal {

    private String nombre;
    private String tipo;
    private Date fechaEntrada;
    private String especie;
    private float peso;
    private String tipoLesion;
    private String gravedad;
    private Tratamiento tratamiento;
    private Liberacion liberacion;
    private Muerte muerte;

    public Animal(String nombre, String tipo, Date fechaEntrada, String especie, float peso, String tipoLesion, String gravedad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaEntrada = fechaEntrada;
        this.especie = especie;
        this.peso = peso;
        this.tipoLesion = tipoLesion;
        this.gravedad = gravedad;
        this.tratamiento = new Tratamiento();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTipoLesion() {
        return tipoLesion;
    }

    public void setTipoLesion(String tipoLesion) {
        this.tipoLesion = tipoLesion;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Liberacion getLiberacion() {
        return liberacion;
    }

    public void setLiberacion(Liberacion liberacion) {
        this.liberacion = liberacion;
    }

    public Muerte getMuerte() {
        return muerte;
    }

    public void setMuerte(Muerte muerte) {
        this.muerte = muerte;
    }
    
    abstract public String datoExtra();
}
