/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model.token;
import grupp01.calculator.model.token.*;

/**
 *
 * @author optimusprime
 */
public class Operand extends TokenStack{
    
    private static double value;
    
    
    public static double toDouble(Object input) {
        
        value = Double.parseDouble(String.valueOf(input));
        return value;
    }   
}

