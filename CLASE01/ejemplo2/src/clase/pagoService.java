
package clase;


public class pagoService 

{
    public double procesar(double n1, double n2, double n3)
    {
        double res=n1*n2*n3;
        return res;
        
    }
    
    public double renta(double res)
    {
        double rent = res*0.08;
        return rent;
    }
    
    
}
