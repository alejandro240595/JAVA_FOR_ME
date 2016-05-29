/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.sueldoaapp.service;

import pe.egcc.sueldoaapp.dto.SueldoDto;
import static pe.egcc.sueldoaapp.service.ComAbstract.Bonificacion_empleado;

/**
 *
 * @author David
 */
public class CoordinadorModel extends ComAbstract


{   @Override
        public  SueldoDto[] procesar(double total)
    {
        //Variables
        double sueldo = 5000.0, bonificacion;
        //proceso
       
        bonificacion= sueldo*Bonificacion_empleado;
        
        //salida de datos
        SueldoDto[] rpta = 
        
        {   
            new SueldoDto("Sueldo", sueldo),
            new SueldoDto("Bonificacion", bonificacion)
            
        };
        
        return rpta;
        
    }
    
}
