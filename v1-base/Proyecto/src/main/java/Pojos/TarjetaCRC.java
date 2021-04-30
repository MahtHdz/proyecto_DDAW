/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojos;

import java.util.List;

/**
 *
 * @author maht_
 */
public class TarjetaCRC {
    public static int idTarjetaActual;
    
    private int id;
    private String clase;
    private String listaSuper;
    private String listaSub;
    private List<TablaTCRC> tablaTarjetaCRC;

    public TarjetaCRC(int id, String clase, String listaSuper, String listaSub, List<TablaTCRC> tablaTarjetaCRC) {
        this.id = id;
        this.clase = clase;
        this.listaSuper = listaSuper;
        this.listaSub = listaSub;
        this.tablaTarjetaCRC = tablaTarjetaCRC;
    }
    
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
    
    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getListaSuper() {
        return listaSuper;
    }

    public void setListaSuper(String listaSuper) {
        this.listaSuper = listaSuper;
    }

    public String getListaSub() {
        return listaSub;
    }

    public void setListaSub(String listaSub) {
        this.listaSub = listaSub;
    }

    public List<TablaTCRC> getTablaTarjetaCRC() {
        return tablaTarjetaCRC;
    }

    public void setTablaTarjetaCRC(List<TablaTCRC> tablaTarjetaCRC) {
        this.tablaTarjetaCRC = tablaTarjetaCRC;
    }
    
    
}
