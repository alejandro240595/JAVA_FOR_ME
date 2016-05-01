

package pe.egcc.PagoService;

import pe.egcc.PagoDto.dato;

/**
 *
 * @author Alumno
 */
public class calculo {
   
    public void procesar(dato pagodto){
        double r;
        
   double v=(pagodto.getDias())*(pagodto.getHorasdia())*(pagodto.getPagohora());
   
    pagodto.setIngresos(v);
    
       if( v>1500)
       {
           r=0.08*v;
         pagodto.setRenta(r);
          
       }
       else
       {
           r=0;
          pagodto.setRenta(r);
       }
       double n=v-r;
    pagodto.setNeto(n);
   
    }
}
