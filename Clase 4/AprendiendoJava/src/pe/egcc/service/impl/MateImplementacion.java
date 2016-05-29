
package pe.egcc.service.impl;

import pe.egcc.service.espec.IMate;

/**
 *
 * @author Alumno
 */
public class MateImplementacion implements IMate

{

    @Override
    public int sumar(int... datos) //  define que puede ser uno o mas argumentos
            
    {
        int suma = 0;
        for(int dato : datos)
        {
            suma+= dato;
        }
        return suma;
    }
    
    
}
