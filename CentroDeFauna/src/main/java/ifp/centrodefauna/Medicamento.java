/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifp.centrodefauna;

/**
 *
 * @author ajpyu
 */
public class Medicamento {
    private String Medicamento;
    private String Prescripcion;

    public Medicamento(String Medicamento, String Prescripcion) {
        this.Medicamento = Medicamento;
        this.Prescripcion = Prescripcion;
    }

    public Medicamento() {
    }
    
    
    
    //Getters y Setters

    public String getMedicamento() {
        return Medicamento;
    }

    public void setMedicamento(String Medicamento) {
        this.Medicamento = Medicamento;
    }

    public String getPrescripcion() {
        return Prescripcion;
    }

    public void setPrescripcion(String Prescripcion) {
        this.Prescripcion = Prescripcion;
    }
    
}
