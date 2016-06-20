
package pe.egcc.model.prueba;

import pe.egcc.model.estudiante;


public class prueba01 
{
    public static void main(String[] args) 
    {
        estudiante est01 = new estudiante();
        
        est01.setApellido("Trujillo");
        est01.setNombre("David");
        est01.setEdad(20);
        est01.setEmail("ale240595");
        est01.setCasado(true);
        
        System.out.println("Nombre: " + est01.getNombre());
        System.out.println("------------------------");
        System.out.println(est01);
        
    }
    
}
