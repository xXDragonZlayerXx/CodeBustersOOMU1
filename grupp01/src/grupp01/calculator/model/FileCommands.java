/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model;

import java.util.Scanner;

/**
 *
 * @author S141747
 */
public class FileCommands {
    
            java.io.File ifile;
            java.io.File ofile;
   public FileCommands(String input, String output){

        ifile = new java.io.File(input);
          ofile = new java.io.File(output);
    
    }
      public String ReadInputFile() 
            throws Exception {
        
        String line = "";
        
        try (Scanner input = new Scanner(ifile)) {
            if(input.hasNext()){
                line = input.nextLine();
            }
            return line;
        }
    }
            
    public void WriteOutputFile(double result)
            throws Exception {

        java.io.PrintWriter output = new java.io.PrintWriter(ofile);
            output.println(result);
        
    }
    
    public void closeOutputFile() throws Exception{
        try{
        java.io.PrintWriter output = new java.io.PrintWriter(ofile);
            output.println("slut på fil");
        }catch(Exception e){
        System.out.println(e.getMessage());
        }
    }
}
