/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matzi
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
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
    @Test
    public void testResta() {
         System.out.println("restar");
         Calculadora cal= new Calculadora(8, 2);
         int resultado=4;
         int resul=cal.restar();
         if(resultado==resul){
             System.out.println("Test aprobado");
         }else{
             System.out.println("Test Fallado ");
             fail();
         }
        
    }
    @Test
    public void testMultiplicacion() {
         System.out.println("multiplicar");
         Calculadora cal= new Calculadora(8, 2);
         int resultado=16;
         int resul=cal.multiplicar();
         if(resultado==resul){
             System.out.println("Test aprobado");
         }else{
             System.out.println("Test Fallado ");
             fail();
         }
        
    }
    @Test
    public void testDividir() {
         System.out.println("dividir");
         Calculadora cal= new Calculadora(8, 2);
         int resultado=4;
         int resul=cal.division();
         if(resultado==resul){
             System.out.println("Test aprobado");
         }else{
             System.out.println("Test Fallado ");
             fail();
         }
       
    }
    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
       
    }
}
