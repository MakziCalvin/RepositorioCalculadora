/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Matzi
 */
public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora() {
    }

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sumar(){
        return this.num1+this.num2;
    }
    public int restar(){
        return this.num1-this.num2;
    }
    public int multiplicar(){
        return this.num1*this.num2;
    }
    public int division(){
        return this.num1/this.num2;
    }
    
    
    
}
