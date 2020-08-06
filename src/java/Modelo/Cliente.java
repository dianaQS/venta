/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Diana
 */
public class Cliente {
     private int idcliente;
    private String nombre;
    private String apellido;
    private String distrito;
    private int montocompra;
    private String tipoafiliacion;

    public Cliente(int idcliente, String nombre, String apellido, String distrito, int montocompra, String tipoafiliacion) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.distrito = distrito;
        this.montocompra = montocompra;
        this.tipoafiliacion = tipoafiliacion;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getMontocompra() {
        return montocompra;
    }

    public void setMontocompra(int montocompra) {
        this.montocompra = montocompra;
    }

    public String getTipoafiliacion() {
        return tipoafiliacion;
    }

    public void setTipoafiliacion(String tipoafiliacion) {
        this.tipoafiliacion = tipoafiliacion;
    }
    
    
}
