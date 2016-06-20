
package pe.egcc.prueba;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.dto.ComboDto;

/**
 *
 * @author Alumno
 */
public class PRUEBA12

{
    //lista generica 
    //lista tipo object
    
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        lista.add("Java");
        lista.add("JDBC");
        lista.add("Hola");
        lista.add("Cloud");
        
        
        for (String dato : lista) 
        
        {
            System.out.println(dato);
            
        }
        
        System.out.println("------------------");
        lista.set(2, "Oracle");
        lista.add(0, "Linux");
        lista.stream().forEach(s -> System.out.println(s));
    }
    
}
