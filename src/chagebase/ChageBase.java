/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chagebase;

/**
 *
 * @author Dat
 */
public class ChageBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConvertBase convert = new ConvertBase();
        Display display = new Display();
        //loop util user choose exit
        while (true) {
            //Step 1: Display menu
            display.displayMenu();
            //Step 2: Required user choose the base number input
            int baseInput = Utility.getBaseInputNumber("Enter base input number: ");
            //Step 3: Required user choose the base number output
             int baseOutput = Utility.getBaseOutputNumber("Enter base output number: ", baseInput);
            //Step 4: Required user enter the input value
            String value = Utility.getInputValue("Enter input value: ", baseInput);
            //Step 5: Program process and print output value
            convert.convertAndPrintOutput(baseInput, baseOutput, value);
            //Step 6: Check exit program
            convert.checkExitProgram();
        }
    }

}
