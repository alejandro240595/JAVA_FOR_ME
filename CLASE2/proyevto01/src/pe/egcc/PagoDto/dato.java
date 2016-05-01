/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.egcc.PagoDto;

/**
 *
 * @author Alumno
 */
public class dato {
    
    private int horasdia;
     private int dias;
      private int pagohora;
        private double ingresos;
       private double renta;
       private double neto;

  
 public dato() {
    }

  

    public dato(int horasdia, int dias, int pagohora) {
        this.horasdia = horasdia;
        this.dias = dias;
        this.pagohora = pagohora;
    }

    public int getHorasdia() {
        return horasdia;
    }

    public void setHorasdia(int horasdia) {
        this.horasdia = horasdia;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getPagohora() {
        return pagohora;
    }

    public void setPagohora(int pagohora) {
        this.pagohora = pagohora;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

  

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

  

    @Override
    public String toString() {
       String st="["+"ingresos:" +ingresos+"\n renta:"+renta+"\n neto:"+neto+"]";
       return st;
    }
    

    
}
