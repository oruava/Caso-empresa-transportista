package org.example;
import java.util.ArrayList;


public class Empresa {
    private String nombre;
    private String direccion;
    private ArrayList<Sucursal> sucursales = new ArrayList<>();

    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

    }
