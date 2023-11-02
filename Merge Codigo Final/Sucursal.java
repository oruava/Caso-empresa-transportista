package org.example;
import java.util.ArrayList;

public class Sucursal {
    private int codigo;
    private String region;
    private ArrayList<Camion> camiones = new ArrayList<>();

    public Sucursal(int codigo, String region) {
        this.codigo = codigo;
        this.region = region;
    }

    public void agregarCamion(Camion camion) {
        camiones.add(camion);
    }
    public void quitarCamion(Camion camion) {
        camiones.remove(camion);
    }
}
