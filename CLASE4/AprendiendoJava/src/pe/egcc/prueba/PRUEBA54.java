
package pe.egcc.prueba;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.dto.ComboDto;

/**
 *
 * @author Alumno
 */
public class PRUEBA54

{
    //lista generica 
    //lista tipo object
    
    public static void main(String[] args) {
        List lista = new ArrayList();
        
        lista.add(345);
        lista.add(546.78);
        lista.add("Hola");
        lista.add(new ComboDto("111","Peru",null,true));
        
        
        for (int i = 0; i < lista.size(); i++) 
        
        {
            Object o = lista.get(i);
            System.out.println(o);
            
        }
    }
    
}
