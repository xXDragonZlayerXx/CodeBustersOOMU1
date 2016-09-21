/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.controller;

import grupp01.calculator.model.*;
import grupp01.calculator.view.*;
import java.util.Scanner;
/**
 *
 * @author optimusprime
 */
public class Controller {
    
    public Controller(){
    }
    
    public void Run(String args[]) {
        View view;
        model calculator = new model();

        //while (arg.length != null) {
          //  try {
                if (args.length == 0) {
                    view = new CommandView();
                    calculator.InputStackTokens(view.GetInput());
                    view.DisplayResult(calculator.EvaluateToken());
                } else {
                    view = new FileView();
                }
            }
        }
    
