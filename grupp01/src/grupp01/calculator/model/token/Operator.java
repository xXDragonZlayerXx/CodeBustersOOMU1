/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model.token;

import grupp01.calculator.model.token.TokenStack;
import java.util.Stack;

/**
 *
 * @author optimusprime
 */
public abstract class Operator extends TokenStack{
    
        abstract public double Operation(Stack st);
        
        //public boolean IsOperator(String st){
           // return st.matches(["+/-*%"]);
       // }
}