
package pe.egcc.sueldoaapp.service;

import pe.egcc.sueldoaapp.dto.SueldoDto;

public abstract class  ComAbstract 

{
    public static final double Bonificacion_empleado = 1.0;
    public static final double Bonificacion_docente = 0.7;
    
    public abstract SueldoDto[] procesar(double total);
    
            
    
}
