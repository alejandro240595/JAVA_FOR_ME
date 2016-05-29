
package pe.egcc.sueldoaapp.dto;


public class SueldoDto

{
    private String nombre;
    private double valor;

    public SueldoDto()
    {
        
    }

    public SueldoDto(String nombre, double valor) 
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
