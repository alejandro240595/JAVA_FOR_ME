
package pe.egcc.prueba;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Alumno
 */
public class prueba3 {

  
    public static void main(String[] args) {
       int[] notas = new int[5];
       
        System.out.println("for indexado"); // usa el indice del arreglo para ingresar a los datos del mismo
        for (int i = 0; i < notas.length; i++)
        {
            int nota = notas[i];
            System.out.println(nota);
            
        }
        
        notas[2]=20;
        notas[4]=25;
        
        System.out.println("Recorrido tipo conexion");
        for(int nota : notas)
        {
            System.out.println(nota);
        }
        
        System.out.println("Yo");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(i);
            
        }
        
        
        System.out.println("Usando lambda");
        Arrays.stream(notas).forEach(n -> System.out.println(n));
    
    }
    
}
