package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(obtenerEstado());
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
