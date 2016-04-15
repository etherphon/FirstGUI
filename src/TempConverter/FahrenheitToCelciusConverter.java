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
public class FahrenheitToCelciusConverter implements TempConverterStrategy {
    
    public FahrenheitToCelciusConverter() {
        
    }
    
    @Override
    public final Double convertTemp(String fTemp) throws IllegalArgumentException {
        ValidatorStrategy tempValidator = new TemperatureValidatorService();
        
        if (!tempValidator.isValid(fTemp)) {
            throw new IllegalTempException();
        } else {
            return (Double.parseDouble(fTemp) - 32) / 1.8;
        }
        
    }
    
}
