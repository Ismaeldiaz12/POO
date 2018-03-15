/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datospersonales;

import static java.time.Clock.system;

/**
 *
 * @author Isma
 */
public class Datospersonales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String datospersonales = "Datos:";
       String nombre = "Nombre:";
       String fecha = "Fecha de nacimiento:";
        String edad = "Edad:";
       String lugar = "Lugar de residencia:";
       String ocupacion = "Ocupacion:";
       System.out.println(datospersonales+ " Datos personales");
       System.out.println(nombre+ " Jose Ismael Diaz Miranda" );
       System.out.println(fecha+ " 12-Abril-1991" );
       System.out.println(edad+ " 26 años" );
       System.out.println(lugar+ " Soyapango" );
       System.out.println(ocupacion+ " Estudiante/Empleado" );
        
         
    }
    
}
