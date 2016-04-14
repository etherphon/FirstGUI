/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgui;

/**
 *
 * @author etherdesign
 */
public class TemperatureValidatorService {
    
    public static final boolean isValidTemp(String s) {
        int len = s.length();
        int i = 0;
        
        if (s.charAt(0) == '-') {
            i = 1;
        }
        
        for (int j = i; j < len; j++) {
            if (!Character.isDigit(s.charAt(j))) {
                return false;
            }
        }
        return true;   
    }
    
    
}
