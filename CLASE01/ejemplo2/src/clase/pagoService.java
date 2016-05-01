
package clase;


public class pagoService 

{
    public void procesar(clase pagoDATO )
    {
        double r;
        double v = (pagoDATO.getDia())*(pagoDATO.getHoraxdia())*(pagoDATO.getPagoxdia());
        pagoDATO.setIngreso(v);
        
        if(v>1500)
        {
            r=0.08*v;
            pagoDATO.setRenta(r);
        }
        else
        {
            r=0;
            pagoDATO.setRenta(r);
        }
        
        double n=v-r;
        pagoDATO.setNeto(n);
    
    }
    

    
    
}
