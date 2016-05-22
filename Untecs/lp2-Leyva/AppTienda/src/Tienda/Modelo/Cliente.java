
package Tienda.Modelo;

public class Cliente 

{
    private int idcliente;
    private String nombres;    
    private String paterno;    
    private String materno ;    
    private String telefono;
    private String distrito;
    private String iddistrito;
    
    //método de actualizacion y retorno

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIddistrito() {
        return iddistrito;
    }

    public void setIddistrito(String iddistrito) {
        this.iddistrito = iddistrito;
    }
    
    
    
}
