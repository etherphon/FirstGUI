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
public class FahrenheitToCelciusConverter implements TempConverterStrategy {
    
    public FahrenheitToCelciusConverter() {
        
    }
    
    @Override
    public final Double convertTemp(String fTemp) throws IllegalArgumentException {
        
        if (!TemperatureValidatorService.isValidTemp(fTemp)) {
            throw new IllegalTempException();
        } else {
            return (Double.parseDouble(fTemp) - 32) / 1.8;
        }
        
    }
    
}
