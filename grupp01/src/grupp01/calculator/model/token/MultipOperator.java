/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model.token;

import grupp01.calculator.model.*;
/**
 *
 * @author optimusprime (elvir)
 */
public class MultipOperator extends RPN {

    @Override
    public double EvaluateToken() throws Exception {
    
    return st.pop().EvaluateToken() * st.pop().EvaluateToken();
    }
}
