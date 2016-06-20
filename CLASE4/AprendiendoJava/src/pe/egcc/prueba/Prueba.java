
package pe.egcc.prueba;

import pe.egcc.service.espec.IMate;



public class Prueba

{
    public static void main(String[] args) 
    
    {
        IMate mate = new pe.egcc.service.impl2.MateImplementacion();
        System.out.println("5 + 8 + 3 = " + mate.sumar(1,2,3,4,5,6,7,8,9,10));
        
    }
    
}
