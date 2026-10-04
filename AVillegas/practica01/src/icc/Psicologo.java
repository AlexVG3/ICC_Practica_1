/** 
 *  practica01
 *  Psicologo.java 
 *  El proposito de este programa es simular luna sesion con un psicologo
 *  usando objetos de clase string
 * 
*/

import java.util.Scanner; //Importamos para que java sepa donde buscar el scanner

public class Psicologo {

    
    public static void main(String[] args) {

        Scanner ui = new Scanner(System.in); // creamos un objeto scanner como ui (User input)
        System.out.println("Bienvenido, por favor ingresa tu nombre para iniciar sesion"); //BIenvenida
        String pacienteNombre = ui.nextLine(); // Lectura de ui

        System.out.println("Bienvenido " + pacienteNombre + ".");
        System.out.println("Dime, cual es tu problema en la vida?");

        String problemitasPaciente = ui.nextLine(); 
        System.out.println("Procesando...");
        System.out.println("Ya veo, y por que dice que " + '"' + problemitasPaciente + '"' + "");
        String problemasExplicados = ui.nextLine();
        System.out.println("Procesando...");
        System.out.println("Ya veo, es una pena. Espero que todo mejore pronto");
        System.out.println("Serian 1000 pesos, por favor. Deposite en 123123123 o su sistema operativo sera eliminado.");
        
    }
}
