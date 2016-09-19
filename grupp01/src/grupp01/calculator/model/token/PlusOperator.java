/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model.token;

import grupp01.calculator.model.token.Operand;
import grupp01.calculator.model.*;
import java.util.Stack;
import grupp01.calculator.model.token.OperatorInfo;



@OperatorInfo(op = "+")

public class PlusOperator extends model {

public PlusOperator() {
   
}

public double EvaluateToken(Stack<Token> st) 
        throws Exception {
    
    return st.pop().EvaluateToken() + st.pop().EvaluateToken();
    }
}
