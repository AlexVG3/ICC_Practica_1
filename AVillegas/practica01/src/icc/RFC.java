/** 
 *  practica01
 *  RFC.java 
 *  El proposito de este programa es generar un RFC a partir de los datos del usuario
 *  usando objetos de clase string
 *  Autor: Alex Villegas
*/

import java.util.Scanner; //Importamos otra vez para que java sepa donde buscar el scanner

public class RFC {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Bienvenido, por favor ingresa tu nombre completo en formato Nombre ApellidoPaterno ApellidoMaterno.");
        System.out.println("(si tienes 2 nombres, ingresar solo el primero)");
        String nombreCompleto = ui.nextLine();
        // "Dividimos" el texto por cada espacio que contenga,
        //  Retorna una tabla con las partes del nombre
        String[] partesNombre = nombreCompleto.split(" ");
        String nombre = partesNombre[0];
        String apellidoP = partesNombre[1];
        String apellidoM = partesNombre[2];

        System.out.println("Ahora ingresa tu fecha de nacimiento en el formato dd/mm/aa");  
        String fechaNacimiento = ui.nextLine();
        String[] fechasSeparadas = fechaNacimiento.split("/");
        String dd = fechasSeparadas[0], mm = fechasSeparadas[1], aa = fechasSeparadas[2];
        String fechaFinal = aa + mm + dd; 

        String inicial = nombre.substring(0,1);
        String inicialesP = apellidoP.substring(0,2);
        String inicialM = apellidoM.substring(0,1);

        String RFCnombre = (inicialesP + inicialM + inicial).toUpperCase();
        String RFCfinal = (RFCnombre + fechaFinal);
        System.out.println("Su RFC es: " + RFCfinal);
    }
}
