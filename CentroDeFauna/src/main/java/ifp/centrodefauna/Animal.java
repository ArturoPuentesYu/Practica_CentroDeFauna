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

    /**
     * Constructor que se utiliza para dar de alta al animal sin rellenar todos los datos del mismo
     * @param nombre
     * @param tipo
     * @param fechaEntrada
     * @param especie
     * @param peso
     * @param tipoLesion
     * @param gravedad
     */
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

    /**
     *
     * @return devuelve el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre cambia el nombre de animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el tipo de animal
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *  Devuelve la fecha de entrada del animal
     * @return
     */
    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     *
     * @param fechaEntrada
     */
    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     *
     * @return
     */
    public String getEspecie() {
        return especie;
    }

    /**
     *
     * @param especie
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     *
     * @return
     */
    public float getPeso() {
        return peso;
    }

    /**
     *
     * @param peso
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     *
     * @return
     */
    public String getTipoLesion() {
        return tipoLesion;
    }

    /**
     *
     * @param tipoLesion
     */
    public void setTipoLesion(String tipoLesion) {
        this.tipoLesion = tipoLesion;
    }

    /**
     *
     * @return
     */
    public String getGravedad() {
        return gravedad;
    }

    /**
     *
     * @param gravedad
     */
    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    /**
     *
     * @return
     */
    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    /**
     *
     * @param tratamiento
     */
    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    /**
     *
     * @return
     */
    public Liberacion getLiberacion() {
        return liberacion;
    }

    /**
     *
     * @param liberacion
     */
    public void setLiberacion(Liberacion liberacion) {
        this.liberacion = liberacion;
    }

    /**
     *
     * @return
     */
    public Muerte getMuerte() {
        return muerte;
    }

    /**
     *
     * @param muerte
     */
    public void setMuerte(Muerte muerte) {
        this.muerte = muerte;
    }
    
    /**
     *
     * @return
     */
    abstract public String datoExtra();
}
