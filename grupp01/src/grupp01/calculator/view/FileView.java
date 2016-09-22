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
//        public void Uview(String[] args) {
//        //lel
//        System.out.println("Resultat från fil: ");
//        FileCommands f = new FileCommands(args[0], args[1]);
//        String str;
//        int i = 0;
//        try{
//        //oändligloop
//        while (i < 10) {
//            str = f.ReadInputFile();
//                            i++;
//            if (i == 10) {
//                System.out.println("Inga fler uttryck");
//                f.closeOutputFile();
//                System.exit(0);
//            } else {
//                calc.InputStackTokens(str);
//                f.WriteOutputFile(calc.EvaluateToken());
//
//            }
//
//        }
//        } catch(Exception e){
//            System.exit(1);
//        }
//    }
    public void Uview(String[] args)throws Exception{
        BufferedReader input;
        BufferedWriter output;
        String StrInput;
        String StrOutput;

            input = new BufferedReader(new FileReader(args[0]));
            output = new BufferedWriter(new FileWriter(args[1]));
            while ((StrInput = input.readLine()) != null) {
                calc.InputStackTokens(StrInput);

                StrOutput = String.valueOf(calc.EvaluateToken());
                output.write(StrOutput);
            }
            input.close();
            output.close();
    }
}
