package org.example;

public class Main {
    public static void main(String[] args) {
        //Pruebas de funcionamiento//
        Flete flete = new Flete(12314,"Aseo");
        Pack pack = new Pack();
        Producto headSholder = new Producto(123123,"Shampoo");
        Producto medicasp = new Producto(1231552,"Medicamento");
        pack.agregarProducto(headSholder);
        pack.agregarProducto(medicasp);
        Pack adasd = new Pack();
        Producto bistec = new Producto(24234234,"Carne");
        Producto pollo = new Producto(24234234,"Carne Blanca");
        adasd.agregarProducto(bistec);
        adasd.agregarProducto(pollo);
        flete.agregarPack(adasd);
        System.out.println(pack.getProductos());
        flete.agregarPack(pack);
        System.out.println(flete.getPacks());
        System.out.println(flete.calcularValorTotal());
    }
}