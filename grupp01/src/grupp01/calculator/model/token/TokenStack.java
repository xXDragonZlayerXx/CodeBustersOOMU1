/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model.token;

import java.util.Stack;

/**
 *
 * @author S143522
 */
public class TokenStack implements TokenType {

    private Stack<TokenType> st;
    private String tokenString;
    // Instansierar stacken av TokenType typ.
    public TokenStack(String expression) {
        tokenString = expression;
        st = new Stack<>();
    }
    // visar det som är det sista elementet i stacken.
    public TokenType ShowToken() {
        return st.peek();
    }
    // retunerar det som är det sista elementet i stacken.
    public TokenType GetToken() {
        return st.pop();
    }
    // sätter in ett element i staken
    public void SetToken(TokenType to) {
        st.push(to);
    }

    public Boolean IsEmpty() {
        return(st.isEmpty());
    }
    
    public TokenType StringToToken(String st) throws Exception {
        Class cl = Class.forName(st);
        TokenType tok = (TokenType) cl.newInstance();
        return tok;
    }
    
       public void DisplayTopToken(){         
           System.out.println(String.valueOf((Object)st.peek()));
       }

    // public abstract double ShowResult(Stack expression) throws Exception;
}
