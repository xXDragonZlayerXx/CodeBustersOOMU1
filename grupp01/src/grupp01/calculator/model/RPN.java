/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model;

import java.util.Stack;
import grupp01.calculator.model.token.*;
import grupp01.calculator.model.token.Operand;
import java.lang.IllegalArgumentException;

/**
 *
 * @author optimusprime94
 */
public class RPN implements Token  {

    protected static Stack<Token> st = new Stack<>();
    
    public RPN(){
            
    }

    // Skapa och lägga om tokens i stacken operator och operander
    public void InputStackTokens(String stringExpression) throws IllegalArgumentException {
       
           String str = new String(stringExpression);
           
           for (String token : str.split(" ")) {
                if(token.matches("[-+]?\\d*\\.?\\d+"))
                 st.push(new Operand(token));
                else{
                switch (token) {
                    case "+":
                        st.push(new PlusOperator());
                        break;
                    case "-":
                        st.push(new MinusOperator());
                        break;
                    case "*":
                        st.push(new MultipOperator());
                        break;
                    case "/":
                        st.push(new DivisionOperator());
                        break;
                    case "%":
                       st.push(new ModulusOperator());
                        break;
                        
                    default:
                        throw new IllegalArgumentException("Error: InvalidTokenException");
                }
            }
        }
    }

 

    @Override
    /* Rekursiv Metod som ränkar ut 
    * Uttrycken i Stacken och returnerar det
    *
    */
    public double EvaluateToken() throws Exception {

        double result = 0.0;
        
        if (!st.empty()) {
            result = st.pop().EvaluateToken();
        }
        if(!st.empty()){
            throw new IllegalArgumentException("Error: InvalidOperationException");
        }
        
        return result;
    }
    // Metod som "rensar" stacken efter användning
    public void clearStack(){
        RPN.st.clear();
    }
}


