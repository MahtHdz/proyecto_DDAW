/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojos;

/**
 *
 * @author maht_
 */
public class TablaTCRC {
    private String responsabilidad;
    private String colaborador;

    public TablaTCRC(String responsabilidad, String colaborador) {
        this.responsabilidad = responsabilidad;
        this.colaborador = colaborador;
    }

    public String getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(String responsabilidad) {
        this.responsabilidad = responsabilidad;
    }

    public String getColaborador() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }
    
    

}
