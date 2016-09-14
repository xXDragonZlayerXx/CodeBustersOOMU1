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
public class TokenStack implements Token {

    private Stack<Token> st;

    // Instansierar stacken av Token typ.
    public TokenStack() {
        st = new Stack<>();
    }
    // visar det som är det sista elementet i stacken.
    public Token ShowToken() {
        return st.peek();
    }
    // retunerar det som är det sista elementet i stacken.
    public Token GetToken() {
        return st.peek();
    }
    // sätter in ett element i staken
    public void SetToken(Token to) {
        st.push(to);
    }

    public Boolean IsEmpty() {
        return(st.isEmpty());
    }
    
    public Token StringToToken(String st) throws Exception {
        Class cl = Class.forName(st);
        Token tok = (Token) cl.newInstance();
        return tok;
    }
    
       public void DisplayTopToken(){
           System.out.println(st.peek());
       }

    // public abstract double ShowResult(Stack expression) throws Exception;
}
