/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgui;

/**
 *
 * @author jhedding
 */
public class TempConverterService {
        
    public TempConverterService() {
        
    }
    
    public static final Double convertFtoC(String fTemp) throws IllegalArgumentException {
        
        if (!TemperatureValidatorService.isValidTemp(fTemp)) {
            throw new IllegalTempException();
        } else {
            return (Double.parseDouble(fTemp) - 32) / 1.8;
        }
        
    }
    
    public static final Double convertCtoF(String cTemp) throws IllegalArgumentException {
        
        if (!TemperatureValidatorService.isValidTemp(cTemp)) {
            throw new IllegalTempException();
        } else {
            return (Double.parseDouble(cTemp) * 1.8) + 32;
        }
    }
    
    
    
}
