/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model.token;

/**
 *
 * @author optimusprime
 */
public interface Token {
    
    
   public Token GetToken();
   
   public void SetToken(Token to);
   
   public Boolean IsEmpty();
   
   public Token ShowToken();
   
   public Token StringToToken(String element) throws Exception;
   
   public void DisplayTopToken();
}
