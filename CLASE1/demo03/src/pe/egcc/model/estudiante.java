

package pe.egcc.model;


public class estudiante 

{
   private String nombre;
   private String         apellido;
   private int         edad;
   private boolean                 casado;
   private String email;

    public estudiante() 
    {
        nombre = "paola";
        apellido = "concepcion";
        edad = 20;
        casado = true;
        email = "pegygato";
        System.out.println("Objeto creado!!!!!!!!!");
                
    }

    public estudiante(String nombre, String apellido, int edad, boolean casado, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
        this.email = email;
    }

    @Override
    protected void finalize() throws Throwable {
        System.err.println("chau objeto");
    }
    
    

   
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() 
    {
        String repo =  "";
        repo += "nombre: " + nombre + "\n";
        repo += "apellido: " + apellido + "\n";
        repo += "email: " + email + "\n";
        repo += "edad: " + edad + "\n";
        repo += "casado: " + casado + "\n";
        return repo; 
    }
   
    
}


