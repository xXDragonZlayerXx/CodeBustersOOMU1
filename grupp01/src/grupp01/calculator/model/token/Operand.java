/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model.token;
import grupp01.calculator.model.token.*;
import grupp01.calculator.model.model;
import java.util.Stack;

/**
 *
 * @author optimusprime
 */
public class Operand extends model{
    
    private double value;
    
    public Operand(String token){
        toDouble(token);
    }
    
    private double toDouble(String token) {
        //exception om det inte är en operand
        value = Double.parseDouble(token);
        return value;
    }   
    
  
    public double EvaluateToken(){
        return value;
    }
}

