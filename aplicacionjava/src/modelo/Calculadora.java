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
        if(num1!=0&&num2!=0){
        return this.num1+this.num2;}
        else{
            return 0;
        }
    }
    public int restar(){
        if(num1!=0&&num2!=0){
        return this.num1-this.num2;}
        else{
            return 0;
        }
    }
    public int multiplicar(){
        if(num1!=0&&num2!=0){
        return this.num1*this.num2;}
        else{
            return 0;
        }
    }
    public int division(){
        if(num1!=0&&num2!=0){
        return this.num1/this.num2;}
        else{
            return 0;
        }
    }
    
    
    
}
