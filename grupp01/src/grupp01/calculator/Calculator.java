/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator;
import grupp01.calculator.controller.Controller;


/*
 *
 * @author Markus
 */
public class Calculator {
    /* Main metod som startar controll metoden
    * med antingen 0 eller 2 kommandoväxlar
    */
    public static void main(String[] args) {
        Controller controll = new Controller();
       try {
       if(args.length == 0 || args.length == 2 )
           controll.Run(args);
       }catch(Exception e ){
           
    System.out.println("Syntax error:"+e);
}
    
}
}
