/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Matzi
 */
public class TestSumar {
    @Test
    public void testSuma() {
         System.out.println("Suma");
         Calculadora cal= new Calculadora(8, 2);
         int resultado=10;
         int resul=cal.sumar();
         if(resultado==resul){
             System.out.println("Test aprobado");
         }else{
             System.out.println("Test Fallado ");
             fail();
         }
        
    }
}
