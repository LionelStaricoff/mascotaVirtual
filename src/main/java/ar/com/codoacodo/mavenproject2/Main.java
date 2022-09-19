
package ar.com.codoacodo.mavenproject2;

import java.time.LocalTime;
import java.util.Scanner;

/**
 *s
 * @author ellaion
 */
public class Main {
    
    public static void main (String args[]){
    
   
      
     MascotaVirtual m1= new MascotaVirtual();
      

         Scanner sc = new Scanner (System.in);
          System.out.print("bienvenido a la mascota virtual, por favor igrese el nombre: ");
           String nombre = sc.nextLine();
          m1.setName (nombre);
          System.out.println("Hola mi nombre es: "+ m1.getName() +" encantado de que juguemos");
          
        m1.setTiempoEstado(LocalTime.now());
      //  System.out.println("hora de nacido: "+m1.getTiempoEstado());
       
      
        m1.menu();  
     
      
      
     
      
        System.out.println("fin");

    }
    
}