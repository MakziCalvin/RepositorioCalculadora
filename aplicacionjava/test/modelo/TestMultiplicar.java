/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.Assert;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Matzi
 */
public class TestMultiplicar {
    
    @Test
    public void testMultiplicacion() {
         System.out.println("multiplicar");
         Calculadora cal= new Calculadora(8, 2);
         
          Assert.assertTrue(cal.multiplicar()==16);
        
    }
}
