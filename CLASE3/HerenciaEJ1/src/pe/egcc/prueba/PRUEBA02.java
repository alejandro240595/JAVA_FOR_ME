

package pe.egcc.prueba;

import pe.egcc.model.clase1;
import pe.egcc.model.clase2;
import pe.egcc.model.clase3;
import pe.egcc.model.clase4;


public class PRUEBA02

{
    public static void main(String[] args) 
    {
        clase2 obj = new clase2();
        
        System.out.println("compatible con object: " + ((obj instanceof Object)?"SI":"NO"));
        System.out.println("compatible con clase1: " + ((obj instanceof clase1)?"SI":"NO"));
        System.out.println("compatible con clase2: " + ((obj instanceof clase2)?"SI":"NO"));
        System.out.println("compatible con clase3: " + ((obj instanceof clase3)?"SI":"NO"));
        System.out.println("compatible con clase4: " + ((obj instanceof clase4)?"SI":"NO"));
        
    }
    
}
