/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.controller;

import grupp01.calculator.model.*;
import grupp01.calculator.view.*;
import java.io.IOException;
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
        boolean quit = false;

            if (args.length == 0) {
                view = new CommandView();

            } else {
                view = new FileView();
            }
            do{
                    try {
            view.Uview(args);
            quit = true;
        } catch (IllegalArgumentException | ArithmeticException | IOException e) {
            System.out.println("Type Of Error: " + e);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
            } while(quit == false);
    }
}
    
