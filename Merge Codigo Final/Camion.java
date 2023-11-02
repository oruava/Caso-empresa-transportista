package org.example;
import java.util.ArrayList;

public class Camion {
    private int codigo;
    private String patente;
    private String descripcion;


    private String estado;

    private ArrayList<Flete> fletes = new ArrayList<>();



    public Camion(int codigo, String patente, String descripcion, String estado) {
        this.codigo = codigo;
        this.patente = patente;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getEstado() {
        return estado;
    }




}
