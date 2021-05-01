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
public class HistoriaDeUsuario {
    public static int idHistoriaActual;
    
    private int id;
    private String nombre;
    private int numero;
    private String fecha;
    private int valor;
    private int tiempo_d;
    private String descripcion;
    private String observaciones;

    public HistoriaDeUsuario(int id, String nombre, int numero, String fecha, int valor, int tiempo_d, String descripcion, String observaciones) {
        this.id = id;
        this.nombre = nombre;
        this.numero = numero;
        this.fecha = fecha;
        this.valor = valor;
        this.tiempo_d = tiempo_d;
        this.descripcion = descripcion;
        this.observaciones = observaciones;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getTiempo_d() {
        return tiempo_d;
    }

    public void setTiempo_d(int tiempo_d) {
        this.tiempo_d = tiempo_d;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
