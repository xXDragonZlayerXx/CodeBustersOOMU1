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



@OperatorInfo(op = "-")

public class OperatorMinus extends TokenStack {

public OperatorMinus(String op) {
    
}

public double Operation(Stack e) throws Exception {
    
    double rightOperand = Operand.toDouble(e.pop());
    double leftOperand = Operand.toDouble(e.pop());

    
    return rightOperand - leftOperand;
    
    }
}