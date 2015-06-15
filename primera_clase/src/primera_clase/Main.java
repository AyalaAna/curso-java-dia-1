
package primera_clase;

import newPackage.ClaseDos;

/**
 *
 * @author laoratorio
 */
public class Main {

   private int contador=0;
   
    public static void main(String[] args) {

        Main jp1=new  Main();
     
        
        for (jp1.contador= 0; jp1.contador< 10; jp1.contador ++) {
            System.out.println("imprimiendo el valor \n \n \n                                                                                                                                                                                                                                   " + jp1.contador);
        }
        
       ClaseDos p1=new ClaseDos();
        System.out.println(" atributos de clase DOs  " + p1.OtraCosa );
        ClaseTres p2=new ClaseTres(); 
         System.out.println(" atributos de clase Tres  " + p2.prot );
     System.out.println(" atributos de clase Tres  " + p2.i );
    }

}
