/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model.token;
import grupp01.calculator.model.RPN;

/**
 *
 * @author optimusprime
 */
public class Operand extends RPN{
    
    private double value;
    // konstruktor som skapar en operand
    public Operand(String token){
        toDouble(token);
    }
    
    //Parsar en Token till double 
    private double toDouble(String token) {
        
        value = Double.parseDouble(token);
        return value;
    }   
    
  
    @Override
    public double EvaluateToken()throws Exception{
        return value;
    }
}

