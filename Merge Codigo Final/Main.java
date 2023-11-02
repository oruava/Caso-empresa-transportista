package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){

        Empresa empresa = new Empresa("POO´s Office","Uruguay 1386");
        Sucursal sucursal = new Sucursal(131,"Araucania");
        Camion camion= new Camion(11412,"SPUV32","Suzuki 88 cilindros","os");
        Flete flete = new Flete(15668344,"realizado por Juan");
        Pack pack= new Pack();
        Producto manzana = new Producto(12514,"Fruta");
        Producto pera = new Producto(12311234,"Fruta");


        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean condicion = true;

        while(condicion) {
            System.out.println("Menú:");
            System.out.println("1. Agregar Producto (manzana)");
            System.out.println("2. Agregar Producto (pera)");
            System.out.println("3. Quitar Producto (manzana)");
            System.out.println("4. Cambiar estado del camion");
            System.out.println("5. Agregar camion a una sucursal");
            System.out.println("6. Quitar camion a una sucursal");
            System.out.println("7. Calcular valor de un flete");
            System.out.println("8. Retroceder");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if(opcion==1){
                pack.agregarProducto(manzana);
                flete.agregarPack(pack);
                System.out.println("El producto fue agregado correctamente");

            }
            else if(opcion==2){
                pack.agregarProducto(pera);
                System.out.println("El producto fue agregado correctamente");
            }

            else if(opcion==3){
                pack.quitarProducto(manzana);
                System.out.println("El producto fue eliminado correctamente");

            }
            else if(opcion==4){
                camion.setEstado(obtenerEstado());
                System.out.println("Estado cambiado exitosamente, el estado ahora es: ");
                System.out.println(camion.getEstado());

            }
            else if(opcion==5){
                sucursal.agregarCamion(camion);
                System.out.println("Camion agregado exitosamente");

            }
            else if(opcion==6){
                sucursal.quitarCamion(camion);
                System.out.println("Camion quitado exitosamente");
            }
            else if(opcion==7){
                System.out.println("El valor del flete es de: ");
                System.out.println(flete.calcularValorTotal());


            }
            else if(opcion==8){
                break;
            }
            else{
                System.out.println("Opcion no valida");
            }
        }
    }






    public static String obtenerEstado(){
        Scanner sc = new Scanner(System.in);
        String estado = "";
        while(true) {
            System.out.println("¿Que estado debe tener el camion, ´ofs´ (out of service) o ´os´ (on service) ?");
            estado = sc.next();
            if (estado.equals("ofs") || estado.equals("os") ){
                break;
            }
            else{
                System.out.println("Respuesta no valida");
            }
        }
        return estado;

    }

}
