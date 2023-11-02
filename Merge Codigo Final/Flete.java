package org.example;
import java.util.ArrayList;
public class Flete {
    private int codigo;
    private String descripcion;
    private ArrayList<Pack> packs = new ArrayList();

    public Flete(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
    public void agregarPack(Pack pack) {
        packs.add(pack);
    }

    public ArrayList<Pack> getPacks() {
        return packs;
    }

    public void quitarPack(Pack pack) {
        packs.remove(pack);
    }

    public int calcularValorTotal() {
        int valor = 0;
        for (int i = 0; i < packs.size(); i++) {
            valor += packs.get(i).getProductos().size() * 5000;
        }
        return valor;
    }
}
