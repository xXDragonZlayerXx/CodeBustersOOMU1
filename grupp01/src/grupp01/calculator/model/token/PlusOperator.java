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
import java.io.*;



@OperatorInfo(op = "+")

public class PlusOperator extends model {


@Override
public double EvaluateToken() throws Exception {
    double operand1, operand2,result;
    
    operand1 = st.pop().EvaluateToken();
    operand2 = st.pop().EvaluateToken();
    result = operand2 + operand1;
    
    return result;
    }
}
