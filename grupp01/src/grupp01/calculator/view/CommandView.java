/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.view;

import grupp01.calculator.model.RPN;
import java.util.Scanner;

/**
 *
 * @author optimusprime
 */
public class CommandView extends View{
    RPN calc = new RPN();
    
    @Override
        public void DisplayView(){
    System.out.println("Ange RPN uttryck <retur> (tom sträng = avsluta): ");
    
    }

    @Override
     /*
    * Uview, metod som väntar på 
    * input från användare och körs
    * tills användaren matar in en tom sträng
    */
    public void Uview(String[] args){
        
        
        Scanner input = new Scanner(System.in);
        String str;
        
        while (true) {
            try{
            System.out.println("Ange RPN uttryck <retur> (tom sträng = avsluta): ");
            str = input.nextLine();
            if (str.isEmpty()) {
                System.out.println("Användaren avslutade programmet");
                System.exit(0);
            } else {
                calc.InputStackTokens(str);
                System.out.println("Svar: " + calc.EvaluateToken());
            }

        }catch(Exception e){
                calc.clearStack();
                System.out.println(e.getMessage());
        
        }
           
     
            }
    }
}
