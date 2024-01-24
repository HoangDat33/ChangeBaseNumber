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
public class Display {

    public void displayMenu(){
        System.out.println("Menu Base: \n"
                + "1. Binary\n"
                + "2. Decimal\n"
                + "3. HexaDecimal");
    }
    public void displayOutPut(String outputValue, int inputBase, int outputBase) {
        switch (inputBase) {
            case 1:
                if (outputBase == 1) {
                    System.out.println("Result when change from bin to bin is : " + outputValue);
                } else if (outputBase == 2) {
                    System.out.println("Result when change from bin to dec is : " + outputValue);
                } else {
                    System.out.println("Result when change from bin to hex is : " + outputValue);
                }
                break;
            case 2:
                if (outputBase == 1) {
                    System.out.println("Result when change from dec to bin is : " + outputValue);
                } else if (outputBase == 2) {
                    System.out.println("Result when change from dec to dec is : " + outputValue);
                } else {
                    System.out.println("Result when change from dec to hex is : " + outputValue);
                }
                break;
            case 3:
                if (outputBase == 1) {
                    System.out.println("Result when change from hex to bin is : " + outputValue);
                } else if (outputBase == 2) {
                    System.out.println("Result when change from hex to dec is : " + outputValue);
                } else {
                    System.out.println("Result when change from hex to hex is : " + outputValue);
                }
                break;
        }
    }
}
