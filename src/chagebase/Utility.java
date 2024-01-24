/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chagebase;

import java.util.Scanner;

/**
 *
 * @author Dat
 */
public class Utility {
    public static int getBaseInputNumber(String msg){
        Scanner sc = new Scanner(System.in);
        //ask user enter util it true
        while(true){
            try {
                System.out.println(msg);
                String input = sc.nextLine();
                //check input empty or not
                if (input.isEmpty()) {
                    System.out.println("Input can't be empty!!!");
                }else{
                    int choose = Integer.parseInt(input);
                    //check input in range
                    if (choose >= 1 && choose <= 3) {
                        return choose;
                    }else{
                        System.out.println("Enter (1/2/3)!!!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Enter (1/2/3)!!!");
            }
            
        }
    }
        public static int getBaseOutputNumber(String msg, int baseInput){
        Scanner sc = new Scanner(System.in);
        //ask user enter util it true
        while(true){
            try {
                System.out.println(msg);
                String input = sc.nextLine();
                //check input empty or not
                if (input.isEmpty()) {
                    System.out.println("Input can't be empty!!!");
                }else{
                    int choose = Integer.parseInt(input);
                    //check input in range
                    if (choose >= 1 && choose <= 3) {
                        //check same with input base
                        if (choose == baseInput) {
                            System.out.println("Base output can't similar with base input!!");
                        }else{
                            return choose;
                        }
                    }else{
                        System.out.println("Enter (1/2/3)!!!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Enter (1/2/3)!!!");
            }
            
        }
    }

    static String getInputValue(String msg,int baseInput) {
        Scanner sc = new Scanner(System.in);
        String inputValue = "";
        //get input follow base input
        switch(baseInput){
            //Get binary value
            case 1: 
                inputValue = getBinaryValue(msg);
                break;
            //Get decimal value
            case 2:
                inputValue = getDecimalValue(msg);
                break;
            //Get hexadecimal value
            case 3: 
                inputValue = getHexValue(msg);
                break;
        }
        return inputValue;
    }

    private static String getBinaryValue(String msg) {
        Scanner sc = new Scanner(System.in);
        String input;
        //loop util input is true
        while (true) {            
            System.out.println(msg);
            input = sc.nextLine();
            //check input empty or not
            if (input.isEmpty()) {
                System.out.println("Input can't be empty!!!");
            }else{
                //check input match with regex (binary)
                if(input.matches(Constant.regexBin)){
                    return input;
                }else{
                    System.out.println("Input must have only (1/0)");
                }
            }
        }
    }

    private static String getDecimalValue(String msg) {
        Scanner sc = new Scanner(System.in);
        String input;
        //loop util input is true
        while (true) {            
            System.out.println(msg);
            input = sc.nextLine();
            //check input empty or not
            if (input.isEmpty()) {
                System.out.println("Input can't be empty!!!");
            }else{
                //check input match with regex (binary)
                if(input.matches(Constant.regexDec)){
                    return input;
                }else{
                    System.out.println("Input must have (0-9)!");
                }
            }
        }
    }

    private static String getHexValue(String msg) {
        Scanner sc = new Scanner(System.in);
        String input;
        //loop util input is true
        while (true) {            
            System.out.println(msg);
            input = sc.nextLine();
            //check input empty or not
            if (input.isEmpty()) {
                System.out.println("Input can't be empty!!!");
            }else{
                //check input match with regex (binary)
                if(input.matches(Constant.regexHex)){
                    return input;
                }else{
                    System.out.println("Input must have (0-9) and (A-F)!");
                }
            }
        }
    }
        public static int getUserChoice(String msg, int min, int max) {
        Scanner sc = new Scanner(System.in);
        //ask user enter until it correct
        while (true) {
            try {
                System.out.println(msg);
                String input = sc.nextLine();
                //check input is empty or not
                if (input.isEmpty()) {
                    System.out.println("Input can't be empty!!!");
                } else {
                    int number = Integer.parseInt(input);
                    //check number in range or not 
                    if (number >= min && number <= max) {
                        return number;
                    } else {
                        System.out.println("Please enter number from " + min + " to " + max + " !!!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter number from " + min + " to " + max + " !!!");
            }
        }
    }
}
