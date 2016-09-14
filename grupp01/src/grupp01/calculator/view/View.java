/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.view;

/**
 *
 * @author Markus
 */
public abstract class View {
    
    public View(){
    }

    public void DisplayExpression(String exp){
        System.out.println("=> " + exp + " = ");
    }

    public void DisplayResult(double result){
        System.out.println("Resultat: " + result);
    }
    
    public void DisplayStartView() {
        System.out.println("Weclome to the Grand Java RPN Calculator.");
        System.out.println();
    }
    
    public abstract void DisplayView();

}
