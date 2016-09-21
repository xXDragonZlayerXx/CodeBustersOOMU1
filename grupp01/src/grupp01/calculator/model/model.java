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

    protected static Stack<Token> st = new Stack<>();

//    public model(String stringExpression) {
//        this.InputStackTokens(stringExpression);
//    }

    public model(){
            
    }

    // Skapa och lägga om tokens i stacken operator och operander
    public void InputStackTokens(String stringExpression) {
       
           String str = new String(stringExpression);
        try {
            for (String token : str.split(" ")) {
                System.out.println("" + token);
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
                    default: // kanske kolla om det är numeric sen pusha annars exception
                        st.push(new Operand(token));
                        break;

                }
            }
        } catch (Exception e) {
            System.out.println("lel feeeel! " + e);
            System.exit(1);
        }
    }


    public double EvaluateExpression() {

        double result = 0.0;
       //   System.out.println(st);
            if (!st.empty()) 
            result = st.pop().EvaluateToken();
        

        return result;
    }
  
        public double EvaluateToken() {
            return EvaluateExpression();
        }
        
        public void test(){
            st.push(new Operand("3"));
            st.push(new Operand("2"));
            st.push(new MultipOperator());
        }
}


// getexpression setexpression?