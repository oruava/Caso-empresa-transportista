package org.example;

import java.util.ArrayList;

public class Pack {
    private ArrayList<Producto> productos = new ArrayList();
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        productos.remove(producto);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}
