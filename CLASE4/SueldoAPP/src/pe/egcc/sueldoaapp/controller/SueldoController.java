
package pe.egcc.sueldoaapp.controller;

import pe.egcc.sueldoaapp.dto.SueldoDto;
import pe.egcc.sueldoaapp.service.AsistenteModel;
import pe.egcc.sueldoaapp.service.ComAbstract;
import pe.egcc.sueldoaapp.service.CoordinadorModel;
import pe.egcc.sueldoaapp.service.DocenteModel;
import pe.egcc.sueldoaapp.service.SecretariaModel;


public class SueldoController 


{
    public static final String USER_COORDINADOR = "COORDINADOR";
    public static final String USER_DOCENTE = "DOCENTE";
    public static final String USER_SECRETRIA = "SECRETARIA";
    public static final String USER_ASISTENTE = "ASISTENTE";
    
    public String[] getTipos()
    {
        String [] tipos = {USER_ASISTENTE,USER_COORDINADOR,USER_SECRETRIA,USER_DOCENTE};
        return tipos;
        
        
        
    }
    
    public SueldoDto[] ProcesarSeleccion(String tipo, double total)
    
    
    {
        ComAbstract user = null;
        
        switch(tipo)
        {
            case USER_ASISTENTE:
                user = new AsistenteModel();
                break;
            case USER_COORDINADOR:
                user = new CoordinadorModel();
                break;
            case USER_SECRETRIA:
                user = new SecretariaModel();
                break;
            case USER_DOCENTE:
                user = new DocenteModel();
                
        }
        
        return user.procesar(total);
        
    }
    
}
