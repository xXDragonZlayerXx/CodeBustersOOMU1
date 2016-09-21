/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model.token;

import grupp01.calculator.model.model;

/**
 *
 * @author optimusprime
 */
public class DivisionOperator extends model{
    
        @Override 
    public double EvaluateToken(){
    double operand1, 
           operand2, 
           result = 0.0;
    boolean succes = false;
    
    do{
        
    try{
        
    operand1 = st.pop().EvaluateToken();
    operand2 = st.pop().EvaluateToken();
    result = operand2 / operand1;
    
    succes = true;
    
    } catch (Exception e){
        
        System.out.println("DivideByZeroException: " + result);
    }
        return result;

    } while(succes == false);    
  }
}
