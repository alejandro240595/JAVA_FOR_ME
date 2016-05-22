

package pe.egcc.model;

import pe.egcc.model.mymath.myMath;


public class Proceso 

{
    private  myMath mate;

    public Proceso() 
    {
      mate = new myMath();
    }
    
    public int factorial(int n)
    {
        return mate.factorial(n);
    }
    
    
    
 
}
