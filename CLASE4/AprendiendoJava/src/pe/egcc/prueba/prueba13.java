
package pe.egcc.prueba;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alumno
 */
public class prueba13 
{
    public static void main(String[] args) {
        Map<String,Object> datos = new HashMap<>();
        
        datos.put("Profesor","Panda");
        datos.put("Edad",45);
        datos.put("Equipo","El pandoso");
        datos.put("Direccion","lima");
        datos.put("Casado",true);
        datos.put("Profesor","Sergio");
        
        for(String Key : datos.keySet())
        {
            System.out.println(Key + "-" + datos.get(Key));
        }
    }
    
}
