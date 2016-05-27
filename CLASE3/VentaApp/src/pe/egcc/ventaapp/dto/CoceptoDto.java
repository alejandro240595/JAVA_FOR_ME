

package pe.egcc.ventaapp.dto;

/**
 *
 * @author Alumno
 */
public class CoceptoDto 

{
    private String nombre;
    private double valor;

    public CoceptoDto() 
    {
        
    }

    
    
    public CoceptoDto(String nombre, double valor)
    {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
