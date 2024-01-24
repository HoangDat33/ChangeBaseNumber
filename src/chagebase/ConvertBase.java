/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chagebase;

import java.math.BigInteger;

/**
 *
 * @author Dat
 */
public class ConvertBase {

    Display display = new Display();

    void convertAndPrintOutput(int baseInput, int baseOutput, String value) {
        String outputValue = "";
        boolean checkNegative = false;
        //check input value is negative or positive
        if (value.startsWith("-")) {
            checkNegative = true;
            value = value.substring(1);
        }
        switch (baseInput) {
            //bin to ?
            case 1:
                outputValue = convertFromBin(baseOutput, value);
                break;
            //dec to ?
            case 2:
                outputValue = convertFromDec(baseOutput, value);
                break;
            //hex to ?
            case 3:
                outputValue = convertFromHex(baseOutput, value);
                break;
        }
        //check negative when display
        if (checkNegative == true) {
            outputValue = "-" + outputValue;

        }
        display.displayOutPut(outputValue, baseInput, baseOutput);
    }

    private String convertFromBin(int baseOutput, String value) {
        String output = "";
        switch (baseOutput) {
            case 2:
                output = binToDec(value);
                break;
            case 3:
                output = binToHex(value);
                break;
        }
        return output;
    }

    private String convertFromDec(int baseOutput, String value) {
        String output = "";
        switch (baseOutput) {
            case 1:
                output = decToBin(value);
                break;
            case 3:
                output = decToHex(value);
                break;
        }
        return output;
    }

    private String convertFromHex(int baseOutput, String value) {
        //output allocation
        String output = "";
        switch (baseOutput) {
            case 1:
                output = hexToBin(value);
                break;
            case 2:
                output = hexToDec(value);
                break;
        }
        return output;
    }

    private String binToDec(String value) {
        BigInteger output = new BigInteger("0");
        BigInteger baseInput = BigInteger.valueOf(2);
        int count = 0;
        //access from the last to the first element in string
        for (int i = value.length() - 1; i >= 0; i--) {
            String stringValue = "";
            char charValue = value.charAt(i);
            //check with binary value
            if (charValue == '1') {
                stringValue = "1";
            } else {
                stringValue = "0";
            }
            BigInteger newBigIntValue = new BigInteger(stringValue);
            BigInteger exponentialCoefficientAfterEachLoop = baseInput.pow(count);
            output = output.add(newBigIntValue.multiply(exponentialCoefficientAfterEachLoop));
            count++;
        }
        return output.toString();
    }

    private String binToHex(String value) {
        String valueDec = binToDec(value);
        String valueHex = decToHex(valueDec);
        return valueHex.toUpperCase();
    }

    private String decToBin(String value) {
        BigInteger bigDec = new BigInteger(value);
        BigInteger baseOutput = new BigInteger("2");
        StringBuilder output = new StringBuilder();
        //loop util bigDec = 0
        while (!bigDec.equals(BigInteger.ZERO)) {
            BigInteger mod = bigDec.mod(baseOutput);
            int intMOD = mod.intValue();
            String modTemp = Integer.toString(intMOD);
            output.insert(0, modTemp);
            bigDec = bigDec.divide(baseOutput);
        }
        return output.toString();
    }

    private String decToHex(String value) {
        BigInteger bigDec = new BigInteger(value);
        BigInteger baseOutput = new BigInteger("16");
        StringBuilder output = new StringBuilder();
        //loop util bigDec = 0
        while (!bigDec.equals(BigInteger.ZERO)) {
            BigInteger mod = bigDec.mod(baseOutput);
            int intMOD = mod.intValue();
            char[] hexChar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};
            output.insert(0, hexChar[intMOD]);
//            output.insert(0, Integer.toHexString(intMOD));
            bigDec = bigDec.divide(baseOutput);
        }
        return output.toString();
    }

    private String hexToBin(String value) {
        String valueDec = hexToDec(value);
        String valueBin = decToBin(valueDec);
        return valueBin;
    }

    private String hexToDec(String value) {
        BigInteger output = new BigInteger("0");
        BigInteger baseInput = BigInteger.valueOf(16);
        int count = 0;
        //access from the last to the first element in string
        for (int i = value.length() - 1; i >= 0; i--) {
            String numberValue = "";
            char charValue = value.charAt(i);
            //check with decimal value
            if (charValue >= '0' && charValue <= '9') {
                numberValue = Integer.toString(charValue - '0');
            } else if (charValue >= 'A' && charValue <= 'F') {
                numberValue = Integer.toString(charValue - 'A' + 10);
            }
            BigInteger newBigIntValue = new BigInteger(numberValue);
            BigInteger exponentialCoefficientAfterEachLoop = baseInput.pow(count);
            output = output.add(newBigIntValue.multiply(exponentialCoefficientAfterEachLoop));
            count++;
        }
        return output.toString();
    }

    void checkExitProgram() {
        int userChoise = Utility.getUserChoice("Do you want update: \n1. Yes\n2. No", 1, 2);
        //check option selected by user
        if (userChoise == 2) {
            System.exit(0);
        }
    }

}
