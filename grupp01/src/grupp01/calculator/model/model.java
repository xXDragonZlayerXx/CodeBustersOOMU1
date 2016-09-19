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

    public model(String StrToToken) {
        this.InputStackTokens(StrToToken);
    }

    public model() {
    }

    // Skapa och lägga om tokens i stacken operator och operander
    private void InputStackTokens(String StrToToken) {
        try {
            for (String token : StrToToken.split(" ")) {

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

    public double EvaluateToken() {
        return st.pop().EvaluateToken();
    }
}
