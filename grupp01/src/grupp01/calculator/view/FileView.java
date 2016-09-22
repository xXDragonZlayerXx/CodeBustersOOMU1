/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.view;

import grupp01.calculator.model.*;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author optimusprime
 */
public class FileView extends View {
    
        model calc = new model();
        
    public FileView(){
    }
    
    @Override
    public void DisplayView(){
        System.out.println("< Read from text-file >");
    }

    @Override
    public void Uview(String[] args){
        String strInput;
        String strOutput;

        PrintStream output = null;
        Scanner scanner = null;
        
        try{
            output = new PrintStream(args[1]);
            scanner = new Scanner(new FileReader(args[0]));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        do{
            try{
                strInput = scanner.nextLine();

                calc.InputStackTokens(strInput);

                strOutput = String.valueOf(String.format("%.2f",calc.EvaluateToken()));
                
                output.println(strOutput);
            }
            catch(Exception e){
                output.println(e.getMessage());
            }
            
        }while(scanner.hasNextLine());

        scanner.close();
        output.close();
    }
}
