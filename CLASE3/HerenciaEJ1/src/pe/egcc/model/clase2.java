
package pe.egcc.model;


public class clase2 extends clase1

{

    public clase2() 
    {
        super("david");
    }
    
    
    public  int restar(int n1, int n2)
    {
        return (n1 - n2);
    }

    @Override
    public int sumar(int n1, int n2)
    {   int suma;
        suma = (n1 + n2)*(n1- n2);
        return suma;
    }
    
}
