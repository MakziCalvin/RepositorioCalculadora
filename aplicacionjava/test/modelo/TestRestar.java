/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Matzi
 */
public class TestRestar {
     @Test
    public void testResta() {
         System.out.println("restar");
         Calculadora cal= new Calculadora(0, 2);
         int resultado=0;
         int resul=cal.restar();
         assertEquals(resultado, resul);
        
    }
}
