/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TempConverter;

/**
 *
 * @author etherdesign
 */
public class TemperatureValidatorService implements ValidatorStrategy {
    
    @Override
    public final boolean isValid(String s) {
        
        int i = 0;
        int decCount = 0;
        
        if (s == null || s.isEmpty()) {
            return false;
        }
        
        int len = s.length();
        
        if (s.charAt(0) == '-') {
            i = 1;
        }
        
        for (int j = i; j < len; j++) {
            if (!Character.isDigit(s.charAt(j))) {
                if (s.charAt(j) == '.' && decCount == 0) {
                    decCount++;
                    continue;
                }
                return false;
            }
        }
        return true;   
    }
    
    
}
