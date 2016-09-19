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
public interface TokenType {
    
    
   public TokenType GetToken();
   
   public void SetToken(TokenType to);
   
   public Boolean IsEmpty();
   
   public TokenType ShowToken();
   
   public TokenType StringToToken(String element) throws Exception;
   
   public void DisplayTopToken();
}
