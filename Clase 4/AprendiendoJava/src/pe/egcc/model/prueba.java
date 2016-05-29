/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.model;

/**
 *
 * @author Alumno
 */
public class prueba 
{
    public static void main(String[] args) {
        clase2 z1 = new clase2();
        clase1 z2= z1;
        
        clase2 z3 = (clase2) z2; // las hijas no pueden apuntar a las padres ( imagina un flujograma donde el mayor no puede ser contenida en la hija
        
        clase3 z4 = (clase3) z2;
    }

    
}
