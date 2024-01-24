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
public class Constant {
    //-? have "-" or not
    //accept only 0 or 1 and unlimited length
    public static final String regexBin = "^-?[0-1]+$";
    //-? have "-" or not
    //accept from 0 to 9 and unlimited length
    public static final String regexDec = "^-?[0-9]+$";
    //-? have "-" or not
    //accept from A to F(only upper case) and from 0 to 9 and unlimited length
    public static final String regexHex = "^-?[A-F0-9]+$";
}
