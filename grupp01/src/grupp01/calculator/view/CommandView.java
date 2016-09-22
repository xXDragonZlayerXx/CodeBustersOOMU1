/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.view;

import grupp01.calculator.model.model;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author optimusprime
 */
public class CommandView extends View{
    model calc = new model();
    
    @Override
        public void DisplayView(){
    System.out.println("Ange RPN uttryck <retur> (tom sträng = avsluta): ");
    
    }

    @Override
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
                System.out.println(e.getMessage());
        
        }
           
     
            }
    }
}
