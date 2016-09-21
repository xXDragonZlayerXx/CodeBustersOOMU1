/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator;
import grupp01.calculator.view.*;
import grupp01.calculator.controller.Controller;
import grupp01.calculator.model.model;
import grupp01.calculator.model.token.*;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Markus
 */
public class Calculator {
    
    public static void main(String[] args) {
        model cal = new model();
         
        
        cal.InputStackTokens("9 4 /");
        //cal.test();
       System.out.println(cal.EvaluateExpression());

    }
    
}
