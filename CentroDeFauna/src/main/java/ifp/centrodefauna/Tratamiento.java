/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifp.centrodefauna;

import java.util.ArrayList;

/**
 *
 * @author Arturo
 */
public class Tratamiento {

    private ArrayList<Medicamento> medicamentos;
    private ArrayList<String> procedimientos;

    public Tratamiento(ArrayList<Medicamento> medicamentos, ArrayList<String> procedimientos) {
        this.medicamentos = medicamentos;
        this.procedimientos = procedimientos;
    }

    public Tratamiento() {
        this.medicamentos = new ArrayList<>();
        this.procedimientos = new ArrayList<>();
    }

    // Getters y setters

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public ArrayList<String> getProcedimientos() {
        return procedimientos;
    }

    public void setProcedimientos(ArrayList<String> procedimientos) {
        this.procedimientos = procedimientos;
    }
    
    public void addMedicamento(Medicamento medicamento) {
        this.medicamentos.add(medicamento);
    }
    
    public void addProcedimiento(String procedimiento) {
        this.procedimientos.add(procedimiento);
    }
}
