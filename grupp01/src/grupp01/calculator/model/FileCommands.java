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
    
        String FromInputFile(String inputFile) 
            throws Exception {
        
        java.io.File file = new java.io.File(inputFile);
        String line = "";
        
        try (Scanner input = new Scanner(file)) {
            if(input.hasNext()){
                line = input.nextLine();
            }
            return line;
        }
    }
            
    void ToOutputFile(String fileName, double result)
            throws Exception {

        java.io.File file = new java.io.File(fileName);
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }
        try (java.io.PrintWriter output = new java.io.PrintWriter(file)) {
            output.println(result);
        }
    }
}
