/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model;

import java.util.Stack;
import grupp01.calculator.model.token.*;
import grupp01.calculator.model.token.Operand;

/**
 *
 * @author optimusprime94
 */
public class model implements Token {

    private Stack<Token> st;

//    public model(String stringExpression) {
//        this.InputStackTokens(stringExpression);
//    }

    public model() {
    }

    // Skapa och lägga om tokens i stacken operator och operander
    public void InputStackTokens(String stringExpression) {
        try {
            for (String token : stringExpression.split(" ")) {

                switch (token) {
                    case "+":
                        st.push(new PlusOperator());
                    case "-":
                        st.push(new MinusOperator());
                    case "*":
                        st.push(new MultipOperator());
                    default: // kanske kolla om det är numeric sen pusha annars exception
                        st.push(new Operand(token));

                }
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }

    @Override
    public double EvaluateToken() {

        double result = 0;

        while (!st.empty()) {
            result = st.pop().EvaluateToken();
        }

        return result;
    }
}


// getexpression setexpression?