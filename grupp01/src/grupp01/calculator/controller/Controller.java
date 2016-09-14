/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.controller;

import grupp01.calculator.model.model;
import grupp01.calculator.view.*;
import java.util.Scanner;
/**
 *
 * @author optimusprime
 */
public class Controller {
    
    public Controller(){}
    
    public void Run(String arg[]) {
        View view;

        while (arg.length != 0) {
            try {
                if (arg.length == 0) {
                    view = new CommandView();
                    //expression evaluation(arg)
                } else {
                    view = new FileView();
                    //file expression evalation(arg)
                }
            } catch (Exception e) {
                System.out.println("Illegal expression type!");
                
            }
        }
    }

    public void CommandOption() {
//        CommandView v = new CommandView();
//        
//    
//        model calc = new model();
//        calc.StackTokens(exp.next());
//
//        v.DisplayView();
//        // input, evaluation från mode, output 
    }

    public void FileOption() {
//        FileView v = new FileView();
//        
//        v.DisplayView();
//        //read from file, display and output + felkontroll?
//        //file input/output from model
//        //view display

    }

}
