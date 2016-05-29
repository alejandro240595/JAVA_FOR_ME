
package pe.egcc.sueldoaapp.service;

import pe.egcc.sueldoaapp.dto.SueldoDto;


public class DocenteModel extends ComAbstract

{
@Override
    public  SueldoDto[] procesar(double total)
    {
        //Variables
        double  sueldo, bonificacion;
        //proceso
        sueldo = total*120;
        bonificacion= sueldo*Bonificacion_docente;
        
        //salida de datos
        SueldoDto[] rpta = 
        
        {   new SueldoDto("Horas", total),
            new SueldoDto("Sueldo", sueldo),
            new SueldoDto("Bonificacion", bonificacion)
            
        };
        
        return rpta;
        
    }
    
    
}
