/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model;

import java.util.Stack;
import java.util.StringTokenizer;
import grupp01.calculator.model.token.*;
import java.util.Scanner;
import grupp01.calculator.model.token.Operand;
/**
 *
 * @author optimusprime94
 */
public class model extends TokenStack {

        TokenStack tok = new TokenStack();

    public model(String userinput) {
        this.InputStackTokens(userinput);
    }
    
       public model() {
    }

    private void InputStackTokens(String userinput) {
        try{
        for (String t : userinput.split(" ")) {
            tok.SetToken(tok.StringToToken(t));
        }
        } catch (Exception e){
            System.exit(0);
        }
    }

    void SetStackValues(String userinput) {
        this.InputStackTokens(userinput);
    }
    
    
    public void EvaluateTokens() {
        TokenStack t = new TokenStack();
        InputStackTokens("1 2 3");
        tok.DisplayTopToken();
             
        
    }
}
