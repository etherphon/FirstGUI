/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgui;

import java.text.DecimalFormat;

/**
 *
 * @author etherdesign
 */
public class StandardTempFormat implements TempFormatStrategy {
 
    public static final String DEG_SYM = "\u00b0";
    
    public StandardTempFormat() {
    
    }
    
    /**
     * Formats the given temperature string to one decimal places, and adds a degree symbol.
     * @param temp Temperature to format.
     * @return A string of the input rounded to one decimal places, and with
     * an added degree symbol.
     */
    @Override
    public final String formatTemp(String temp) {
        
        return String.format("%.1f", Double.parseDouble(temp)) + DEG_SYM;
        
    }
    
}