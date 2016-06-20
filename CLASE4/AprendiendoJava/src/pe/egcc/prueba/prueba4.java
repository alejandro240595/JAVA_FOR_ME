
package pe.egcc.prueba;

import java.util.Arrays;


public class prueba4

{
    public static void main(String[] args) 
    
    {
        String datos[] = new String[5];
        
        for(String dato : datos)
        {
            System.out.println(dato);
            
            
            
        }
        
        datos = new String[]{"Chiclayo","Lima","Cuzco","Arequipa","Huancayo"};
        
        Arrays.stream(datos).forEach(s -> System.out.println(s));
        
    }
    
}
